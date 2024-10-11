# Selenium Grid Automation with Multiple VMs

This project is designed to run automated tests using Selenium Grid on multiple VMs without Docker. The WebDriver will be initialized to cycle through a set of predefined VM IP addresses, allowing for parallel test execution across multiple remote environments.

## Prerequisites

Before you begin, make sure you have the following tools installed:

1. **Java JDK** (version 11 or higher)
2. **Maven** (version 3.6 or higher)
3. **Git** (to clone the repository)
4. **Selenium Grid Hub and Nodes** set up on remote machines

### Selenium Grid Setup on VMs (Manual Setup)

#### Step 1: Download Selenium Server on All VMs

1. Download the [Selenium Server jar](https://www.selenium.dev/downloads/) on each VM where you'll run the Selenium Grid Hub or Node.

   ```bash
   wget https://selenium-release.storage.googleapis.com/4.1.0/selenium-server-4.1.0.jar
   ```

2. Make sure the VM has Java installed:

   ```bash
   java -version
   ```

   If Java is not installed, you can install it using the package manager on your system.

#### Step 2: Start the Selenium Grid Hub

On one of the VMs, start the Selenium Grid Hub:

```bash
java -jar selenium-server-4.1.0.jar hub
```

This will start the hub, and it will be listening on port 4444 by default. Make sure this port is accessible from your test machine and the other VMs.

#### Step 3: Start Selenium Nodes on Each VM

On each VM where you want to run tests, start a Selenium Node and register it with the Hub:

```bash
java -jar selenium-server-4.1.0.jar node --hub http://<hub-ip>:4444/grid/register
```

Replace `<hub-ip>` with the IP address of the hub machine. This will connect the node to the hub.

- You can specify different browsers (e.g., Chrome, Firefox) or capabilities for each node if needed.
- Ensure each VM has the necessary browser installed.

For example, to specify a Chrome Node:

```bash
java -jar selenium-server-4.1.0.jar node --detect-drivers --hub http://<hub-ip>:4444/grid/register
```

This command will automatically detect installed browsers and register them with the hub.

#### Step 4: Verify Grid Setup

You can verify that the Grid is working and that all nodes are correctly registered by visiting the following URL in a browser:

```
http://<hub-ip>:4444/grid/console
```

This will show you a list of available nodes and their capabilities.

## Project Structure

The project is organized as a Maven project with the following structure:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── Bikroy/
│   │           └── testbase/
│   │               └── TestBase.java
│   └── resources/
│       └── config/
│           └── global.properties
└── test/
    └── java/
        └── com/
            └── Bikroy/
                └── tests/
                    └── SampleTest.java
```

### Configuration

In `src/main/resources/config/global.properties`, specify the browser and the base URL you want to test.

```properties
browser=chrome
url=http://example.com
```

### VM Configuration

In `TestBase.java`, the list of VM IPs is defined:

```java
private static final String[] VM_IPS = {
    "149.112.32.198", 
    "149.112.32.199", 
    "149.112.32.200"
};
```

You can update this array with the IP addresses of the VMs where your Selenium nodes are running.

## TestBase Class Logic

The `TestBase.java` file contains the core logic for initializing the WebDriver and setting up test execution across multiple VMs. The key parts of the logic are:

1. **VM IP Addresses**: A predefined list of VM IPs where the Selenium nodes are running is stored in the `VM_IPS` array.
   
   ```java
   private static final String[] VM_IPS = {
       "149.112.32.198", 
       "149.112.32.199", 
       "149.112.32.200"
   };
   ```

2. **Round-Robin Selection of IPs**: The `getNextVmIp()` method implements a round-robin strategy to cycle through the list of VM IPs. This ensures each test execution uses a different VM, distributing the load across multiple nodes.

   ```java
   private String getNextVmIp() {
       int index = ipIndex.getAndIncrement() % VM_IPS.length;
       return VM_IPS[index];
   }
   ```

3. **WebDriver Initialization**: The `initializeDriver()` method is responsible for loading the properties from the `global.properties` file and setting up a `RemoteWebDriver` instance using the next available VM IP.

   ```java
   public WebDriver initializeDriver() throws IOException {
       prop = new Properties();
       try {
           FileInputStream ip = new FileInputStream("src/main/resources/config/global.properties");
           prop.load(ip);
           String browserName = prop.getProperty("browser");
           if (browserName.equalsIgnoreCase("chrome")) {
               ChromeOptions options = new ChromeOptions();
               options.addArguments("--remote-allow-origins=*");

               // Get the next VM IP in the list
               String remoteHubUrl = "http://" + getNextVmIp() + ":4444/wd/hub";
               this.driver = new RemoteWebDriver(new URL(remoteHubUrl), options);
           }
       } catch (IOException e) {
           logger.error("Failed to load prop file", e);
       }
       return this.driver;
   }
   ```

4. **Navigating to the URL**: The `navigateToUrl()` method fetches the test URL from the properties file and navigates the browser to that page.

   ```java
   public void navigateToUrl() {
       String url = prop.getProperty("url");
       if (url != null && !url.isEmpty()) {
           this.driver.get(url);
           System.out.println(url);
       } else {
           logger.error("URL is not provided in the properties file.");
       }

       this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       this.driver.manage().window().maximize();
   }
   ```

5. **Closing the Driver**: The `CloseDriver()` method closes the WebDriver instance once the test is complete.

   ```java
   public void CloseDriver() {
       if (this.driver != null) {
           this.driver.quit();
       }
   }
   ```

## Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/yourusername/selenium-grid-multi-vm.git
cd selenium-grid-multi-vm
```

### Step 2: Install Dependencies

Run the following command to install all dependencies specified in the `pom.xml`:

```bash
mvn clean install
```

### Step 3: Update Configurations

Make sure you update the following:

1. **VM IP Addresses**: Update the IP addresses in the `TestBase.java` class if needed.
2. **Global Properties**: Update the `global.properties` file to set the correct `url` for your test and the desired browser.

### Step 4: Running the Tests

You can run the tests using the following Maven command:

```bash
mvn test
```

This will automatically start the tests on one of the VMs based on the round-robin selection of IP addresses.

### Step 5: Parallel Execution (Optional)

If you're using a test framework like **TestNG**, you can configure parallel test execution in the `testng.xml` file. Here's an example configuration for parallel tests:

```xml
<suite name="TestSuite" parallel="tests" thread-count="3">
    <test name="Test1">
        <classes>
            <class name="com.Bikroy.tests.SampleTest"/>
        </classes>
    </test>
</suite>
```

## Important Notes

1. **Ensure the VMs are reachable**: The VMs must be accessible from your local machine or wherever the tests are triggered.
2. **Selenium Hub and Nodes must be running**: Verify that Selenium Grid hub and nodes are running correctly on the remote VMs before executing the tests.

## Troubleshooting

- If the WebDriver fails to connect to a VM, ensure the VM is reachable, the Selenium Node is running, and the correct port (4444 for the hub) is open.
- Check the logs for both the hub and nodes for any errors:

```bash
java -jar selenium-server-4.1.0.jar hub logs
```

```bash
java -jar selenium-server-4.1.0.jar node logs
```

## License

This project is licensed under the MIT License.

---

