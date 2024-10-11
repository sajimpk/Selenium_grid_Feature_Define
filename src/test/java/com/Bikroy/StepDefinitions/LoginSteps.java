package com.compass.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.compass.pages.LoginPage;
import com.compass.testbase.TestBase;
import com.compass.testbase.TestContextSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {
	TestContextSetup testContext;
	private LoginPage loginPge;
	private static final Logger logger = LogManager.getLogger(LoginSteps.class);

	public LoginSteps(TestContextSetup testContextSetup) {
		this.testContext = testContextSetup;
		loginPge = testContext.getLoginPage();

	}


	@Then("I should see the login logo")
	public void i_should_see_the_compass_logo() throws InterruptedException {

		Assert.assertTrue(loginPge.login_logo().isDisplayed(),"Company Logo not displayed");
		Thread.sleep(3000);
		logger.info("Company Logo displayed");
	}


	@Then("I should click on login logo")
	public void iShouldClickOnLoginLogo() throws InterruptedException {
		loginPge.login_logo().click();
		Thread.sleep(3000);
	}

	@And("I should see the email login options")
	public void iShouldSeeTheEmailLoginOptions() throws InterruptedException {
		Assert.assertTrue(loginPge.email_login().isDisplayed(),"Email Login not displayed");
		Thread.sleep(3000);
		logger.info("email login displayed");
	}

	@Then("I should click on Email login options")
	public void iShouldClickOnEmailLoginOptions() throws InterruptedException {
		loginPge.email_login().click();
		Thread.sleep(3000);
	}

	@And("I should see Username field on this page")
	public void iShouldSeeUsernameFieldOnThisPage() throws InterruptedException {
		Assert.assertTrue(loginPge.email_input_field().isDisplayed(),"Username field not displayed");
		Thread.sleep(3000);
		logger.info("username field displayed");
	}

	@When("I should Input my Username")
	public void iShouldInputMyUsername() throws InterruptedException {
		loginPge.email_input_field().click();
		Thread.sleep(1000);
		loginPge.email_input_field().sendKeys("example@gmail.com");

	}

	@And("I should Input my My Password")
	public void iShouldInputMyMyPassword() throws InterruptedException {
		loginPge.Password_input_field().click();
		Thread.sleep(1000);
		loginPge.Password_input_field().sendKeys("example@gmail.com");
		Thread.sleep(2000);

	}

	@Then("I should Click on Login Button")
	public void iShouldClickOnLoginButton() throws InterruptedException {
		loginPge.Login_Button().click();
		Thread.sleep(5000);
	}

	@Given("I should see the Mobile category")
	public void iShouldSeeTheMobileCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(),"Mobile Category not displayed");
		Thread.sleep(3000);
		logger.info("Mobile Category displayed");
	}

	@Then("I should Click on Mobile Category")
	public void iShouldClickOnMobileCategory() throws InterruptedException {
		loginPge.Mobile_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Mobile product")
	public void iShouldSeeMobileProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(),"Mobile product not displayed");
		Thread.sleep(3000);
		logger.info("Mobile product displayed");
	}

	@Given("I should see the Electronics category")
	public void iShouldSeeTheElectronicsCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(),"Electronics category not displayed");
		Thread.sleep(3000);
		logger.info("Electronics Category displayed");
	}

	@Then("I should Click on Electronics Category")
	public void iShouldClickOnElectronicsCategory() throws InterruptedException {
		loginPge.Electronics_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Electronics product")
	public void iShouldSeeElectronicsProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(),"Electronics product not displayed");
		Thread.sleep(3000);
		logger.info("Electronics product displayed");
	}

	@Given("I should see the Vehicles category")
	public void iShouldSeeTheVehiclesCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(),"Vehicles category not displayed");
		logger.info("Vehicles Category displayed");
	}

	@Then("I should Click on Vehicles Category")
	public void iShouldClickOnVehiclesCategory() throws InterruptedException {
		loginPge.Vehicles_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Vehicles product")
	public void iShouldSeeVehiclesProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(),"Vehicles product not displayed");
		Thread.sleep(3000);
		logger.info("Vehicles product displayed");
	}

	@Given("I should see the Property category")
	public void iShouldSeeThePropertyCategory() {
		Assert.assertTrue(loginPge.Property_category().isDisplayed(),"Property category not displayed");
		logger.info("Property Category displayed");
	}

	@Then("I should Click on Property Category")
	public void iShouldClickOnPropertyCategory() throws InterruptedException {
		loginPge.Property_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Property product")
	public void iShouldSeePropertyProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Property().isDisplayed(),"Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}



//	second step//

	@Then("I should see the login logo2")
	public void i_should_see_the_compass_logo2() throws InterruptedException {

		Assert.assertTrue(loginPge.login_logo().isDisplayed(),"Company Logo not displayed");
		Thread.sleep(3000);
		logger.info("Company Logo displayed");
	}


	@Then("I should click on login logo2")
	public void iShouldClickOnLoginLogo2() throws InterruptedException {
		loginPge.login_logo().click();
		Thread.sleep(3000);
	}

	@And("I should see the email login options2")
	public void iShouldSeeTheEmailLoginOptions2() throws InterruptedException {
		Assert.assertTrue(loginPge.email_login().isDisplayed(),"Email Login not displayed");
		Thread.sleep(3000);
		logger.info("email login displayed");
	}

	@Then("I should click on Email login options2")
	public void iShouldClickOnEmailLoginOptions2() throws InterruptedException {
		loginPge.email_login().click();
		Thread.sleep(3000);
	}

	@And("I should see Username field on this page2")
	public void iShouldSeeUsernameFieldOnThisPage2() throws InterruptedException {
		Assert.assertTrue(loginPge.email_input_field().isDisplayed(),"Username field not displayed");
		Thread.sleep(3000);
		logger.info("username field displayed");
	}

	@When("I should Input my Username2")
	public void iShouldInputMyUsername2() throws InterruptedException {
		loginPge.email_input_field().click();
		Thread.sleep(1000);
		loginPge.email_input_field().sendKeys("example@gmail.com");

	}

	@And("I should Input my My Password2")
	public void iShouldInputMyMyPassword2() throws InterruptedException {
		loginPge.Password_input_field().click();
		Thread.sleep(1000);
		loginPge.Password_input_field().sendKeys("example@gmail.com");
		Thread.sleep(2000);

	}

	@Then("I should Click on Login Button2")
	public void iShouldClickOnLoginButton2() throws InterruptedException {
		loginPge.Login_Button().click();
		Thread.sleep(5000);
	}

	@Given("I should see the Mobile category2")
	public void iShouldSeeTheMobileCategory2() throws InterruptedException {
		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(),"Mobile Category not displayed");
		Thread.sleep(3000);
		logger.info("Mobile Category displayed");
	}

	@Then("I should Click on Mobile Category2")
	public void iShouldClickOnMobileCategory2() throws InterruptedException {
		loginPge.Mobile_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Mobile product2")
	public void iShouldSeeMobileProduct2() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(),"Mobile product not displayed");
		Thread.sleep(3000);
		logger.info("Mobile product displayed");
	}

	@Given("I should see the Electronics category2")
	public void iShouldSeeTheElectronicsCategory2() throws InterruptedException {
		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(),"Electronics category not displayed");
		Thread.sleep(3000);
		logger.info("Electronics Category displayed");
	}

	@Then("I should Click on Electronics Category2")
	public void iShouldClickOnElectronicsCategory2() throws InterruptedException {
		loginPge.Electronics_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Electronics product2")
	public void iShouldSeeElectronicsProduct2() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(),"Electronics product not displayed");
		Thread.sleep(3000);
		logger.info("Electronics product displayed");
	}

	@Given("I should see the Vehicles category2")
	public void iShouldSeeTheVehiclesCategory2() throws InterruptedException {
		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(),"Vehicles category not displayed");
		logger.info("Vehicles Category displayed");
	}

	@Then("I should Click on Vehicles Category2")
	public void iShouldClickOnVehiclesCategory2() throws InterruptedException {
		loginPge.Vehicles_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Vehicles product2")
	public void iShouldSeeVehiclesProduct2() throws InterruptedException {
		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(),"Vehicles product not displayed");
		Thread.sleep(3000);
		logger.info("Vehicles product displayed");
	}

	@Given("I should see the Property category2")
	public void iShouldSeeThePropertyCategory2() {
		Assert.assertTrue(loginPge.Property_category().isDisplayed(),"Property category not displayed");
		logger.info("Property Category displayed");
	}

	@Then("I should Click on Property Category2")
	public void iShouldClickOnPropertyCategory2() throws InterruptedException {
		loginPge.Property_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Property product2")
	public void iShouldSeePropertyProduct2() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Property().isDisplayed(),"Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}
// 3rd step//

	@Then("I should see the login logo3")
	public void i_should_see_the_compass_logo3() throws InterruptedException {
		Assert.assertTrue(loginPge.login_logo().isDisplayed(), "Company Logo not displayed");
		Thread.sleep(3000);
		logger.info("Company Logo displayed");
	}

	@Then("I should click on login logo3")
	public void iShouldClickOnLoginLogo3() throws InterruptedException {
		loginPge.login_logo().click();
		Thread.sleep(3000);
	}

	@And("I should see the email login options3")
	public void iShouldSeeTheEmailLoginOptions3() throws InterruptedException {
		Assert.assertTrue(loginPge.email_login().isDisplayed(), "Email Login not displayed");
		Thread.sleep(3000);
		logger.info("email login displayed");
	}

	@Then("I should click on Email login options3")
	public void iShouldClickOnEmailLoginOptions3() throws InterruptedException {
		loginPge.email_login().click();
		Thread.sleep(3000);
	}

	@And("I should see Username field on this page3")
	public void iShouldSeeUsernameFieldOnThisPage3() throws InterruptedException {
		Assert.assertTrue(loginPge.email_input_field().isDisplayed(), "Username field not displayed");
		Thread.sleep(3000);
		logger.info("username field displayed");
	}

	@When("I should Input my Username3")
	public void iShouldInputMyUsername3() throws InterruptedException {
		loginPge.email_input_field().click();
		Thread.sleep(1000);
		loginPge.email_input_field().sendKeys("example@gmail.com");
	}

	@And("I should Input my My Password3")
	public void iShouldInputMyMyPassword3() throws InterruptedException {
		loginPge.Password_input_field().click();
		Thread.sleep(1000);
		loginPge.Password_input_field().sendKeys("example@gmail.com");
		Thread.sleep(2000);
	}

	@Then("I should Click on Login Button3")
	public void iShouldClickOnLoginButton3() throws InterruptedException {
		loginPge.Login_Button().click();
		Thread.sleep(5000);
	}

	@Given("I should see the Mobile category3")
	public void iShouldSeeTheMobileCategory3() throws InterruptedException {
		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(), "Mobile Category not displayed");
		Thread.sleep(3000);
		logger.info("Mobile Category displayed");
	}

	@Then("I should Click on Mobile Category3")
	public void iShouldClickOnMobileCategory3() throws InterruptedException {
		loginPge.Mobile_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Mobile product3")
	public void iShouldSeeMobileProduct3() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(), "Mobile product not displayed");
		Thread.sleep(3000);
		logger.info("Mobile product displayed");
	}

	@Given("I should see the Electronics category3")
	public void iShouldSeeTheElectronicsCategory3() throws InterruptedException {
		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(), "Electronics category not displayed");
		Thread.sleep(3000);
		logger.info("Electronics Category displayed");
	}

	@Then("I should Click on Electronics Category3")
	public void iShouldClickOnElectronicsCategory3() throws InterruptedException {
		loginPge.Electronics_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Electronics product3")
	public void iShouldSeeElectronicsProduct3() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(), "Electronics product not displayed");
		Thread.sleep(3000);
		logger.info("Electronics product displayed");
	}

	@Given("I should see the Vehicles category3")
	public void iShouldSeeTheVehiclesCategory3() throws InterruptedException {
		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(), "Vehicles category not displayed");
		logger.info("Vehicles Category displayed");
	}

	@Then("I should Click on Vehicles Category3")
	public void iShouldClickOnVehiclesCategory3() throws InterruptedException {
		loginPge.Vehicles_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Vehicles product3")
	public void iShouldSeeVehiclesProduct3() throws InterruptedException {
		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(), "Vehicles product not displayed");
		Thread.sleep(3000);
		logger.info("Vehicles product displayed");
	}

	@Given("I should see the Property category3")
	public void iShouldSeeThePropertyCategory3() {
		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "Property category not displayed");
		logger.info("Property Category displayed");
	}

	@Then("I should Click on Property Category3")
	public void iShouldClickOnPropertyCategory3() throws InterruptedException {
		loginPge.Property_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Property product3")
	public void iShouldSeePropertyProduct3() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}

    //4th step//


	@Then("I should see the login logo4")
	public void i_should_see_the_compass_logo4() throws InterruptedException {
		Assert.assertTrue(loginPge.login_logo().isDisplayed(), "Company Logo not displayed");
		Thread.sleep(3000);
		logger.info("Company Logo displayed");
	}

	@Then("I should click on login logo4")
	public void iShouldClickOnLoginLogo4() throws InterruptedException {
		loginPge.login_logo().click();
		Thread.sleep(3000);
	}

	@And("I should see the email login options4")
	public void iShouldSeeTheEmailLoginOptions4() throws InterruptedException {
		Assert.assertTrue(loginPge.email_login().isDisplayed(), "Email Login not displayed");
		Thread.sleep(3000);
		logger.info("email login displayed");
	}

	@Then("I should click on Email login options4")
	public void iShouldClickOnEmailLoginOptions4() throws InterruptedException {
		loginPge.email_login().click();
		Thread.sleep(3000);
	}

	@And("I should see Username field on this page4")
	public void iShouldSeeUsernameFieldOnThisPage4() throws InterruptedException {
		Assert.assertTrue(loginPge.email_input_field().isDisplayed(), "Username field not displayed");
		Thread.sleep(3000);
		logger.info("username field displayed");
	}

	@When("I should Input my Username4")
	public void iShouldInputMyUsername4() throws InterruptedException {
		loginPge.email_input_field().click();
		Thread.sleep(1000);
		loginPge.email_input_field().sendKeys("example@gmail.com");
	}

	@And("I should Input my My Password4")
	public void iShouldInputMyMyPassword4() throws InterruptedException {
		loginPge.Password_input_field().click();
		Thread.sleep(1000);
		loginPge.Password_input_field().sendKeys("example@gmail.com");
		Thread.sleep(2000);
	}

	@Then("I should Click on Login Button4")
	public void iShouldClickOnLoginButton4() throws InterruptedException {
		loginPge.Login_Button().click();
		Thread.sleep(5000);
	}

	@Given("I should see the Mobile category4")
	public void iShouldSeeTheMobileCategory4() throws InterruptedException {
		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(), "Mobile Category not displayed");
		Thread.sleep(3000);
		logger.info("Mobile Category displayed");
	}

	@Then("I should Click on Mobile Category4")
	public void iShouldClickOnMobileCategory4() throws InterruptedException {
		loginPge.Mobile_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Mobile product4")
	public void iShouldSeeMobileProduct4() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(), "Mobile product not displayed");
		Thread.sleep(3000);
		logger.info("Mobile product displayed");
	}

	@Given("I should see the Electronics category4")
	public void iShouldSeeTheElectronicsCategory4() throws InterruptedException {
		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(), "Electronics category not displayed");
		Thread.sleep(3000);
		logger.info("Electronics Category displayed");
	}

	@Then("I should Click on Electronics Category4")
	public void iShouldClickOnElectronicsCategory4() throws InterruptedException {
		loginPge.Electronics_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Electronics product4")
	public void iShouldSeeElectronicsProduct4() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(), "Electronics product not displayed");
		Thread.sleep(3000);
		logger.info("Electronics product displayed");
	}

	@Given("I should see the Vehicles category4")
	public void iShouldSeeTheVehiclesCategory4() throws InterruptedException {
		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(), "Vehicles category not displayed");
		logger.info("Vehicles Category displayed");
	}

	@Then("I should Click on Vehicles Category4")
	public void iShouldClickOnVehiclesCategory4() throws InterruptedException {
		loginPge.Vehicles_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Vehicles product4")
	public void iShouldSeeVehiclesProduct4() throws InterruptedException {
		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(), "Vehicles product not displayed");
		Thread.sleep(3000);
		logger.info("Vehicles product displayed");
	}

	@Given("I should see the Property category4")
	public void iShouldSeeThePropertyCategory4() {
		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "Property category not displayed");
		logger.info("Property Category displayed");
	}

	@Then("I should Click on Property Category4")
	public void iShouldClickOnPropertyCategory4() throws InterruptedException {
		loginPge.Property_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Property product4")
	public void iShouldSeePropertyProduct4() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}
















}





//
////package com.bikroy.stepdefinitions;
//
//package com.Bikroy.StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
//
//import com.Bikroy.pages.LoginPage;
//import com.Bikroy.testbase.TestBase;
//import com.Bikroy.testbase.TestContextSetup;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps extends TestBase {
//	TestContextSetup testContext;
//	private LoginPage loginPge;
//	private static final Logger logger = LogManager.getLogger(LoginSteps.class);
//
//	public LoginSteps(TestContextSetup testContextSetup) {
//		this.testContext = testContextSetup;
//		loginPge = testContext.getLoginPage();
//	}
//
//	@Given("I should see the login logo")
//	public void iShouldSeeTheLoginLogo() throws InterruptedException {
//		Assert.assertTrue(loginPge.login_logo().isDisplayed(), "Company Logo not displayed");
//		Thread.sleep(3000);
//		logger.info("Company Logo displayed");
//	}
//
//	@Then("I should click on login logo")
//	public void iShouldClickOnLoginLogo() throws InterruptedException {
//		loginPge.login_logo().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should see the email login options")
//	public void iShouldSeeTheEmailLoginOptions() throws InterruptedException {
//		Assert.assertTrue(loginPge.email_login().isDisplayed(), "Email Login not displayed");
//		Thread.sleep(3000);
//		logger.info("email login displayed");
//	}
//
//	@Then("I should click on Email login options")
//	public void iShouldClickOnEmailLoginOptions() throws InterruptedException {
//		loginPge.email_login().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should see Username field on this page")
//	public void iShouldSeeUsernameFieldOnThisPage() throws InterruptedException {
//		Assert.assertTrue(loginPge.email_input_field().isDisplayed(), "Username field not displayed");
//		Thread.sleep(3000);
//		logger.info("username field displayed");
//	}
//
//	@When("I should Input my Username")
//	public void iShouldInputMyUsername() throws InterruptedException {
//		loginPge.email_input_field().click();
//		Thread.sleep(1000);
//		loginPge.email_input_field().sendKeys("example@gmail.com");
//	}
//
//	@And("I should Input my My Password")
//	public void iShouldInputMyMyPassword() throws InterruptedException {
//		loginPge.Password_input_field().click();
//		Thread.sleep(1000);
//		loginPge.Password_input_field().sendKeys("example@gmail.com");
//		Thread.sleep(2000);
//	}
//
//	@Then("I should Click on Login Button")
//	public void iShouldClickOnLoginButton() throws InterruptedException {
//		loginPge.Login_Button().click();
//		Thread.sleep(5000);
//	}
//
//	@Given("I should see the Mobile category")
//	public void iShouldSeeTheMobileCategory() throws InterruptedException {
//		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(), "Mobile Category not displayed");
//		Thread.sleep(3000);
//		logger.info("Mobile Category displayed");
//	}
//
//	@Then("I should Click on Mobile Category")
//	public void iShouldClickOnMobileCategory() throws InterruptedException {
//		loginPge.Mobile_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See Mobile product")
//	public void iShouldSeeMobileProduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(), "Mobile product not displayed");
//		Thread.sleep(3000);
//		logger.info("Mobile product displayed");
//	}
//
//	@Given("I should see the Electronics category")
//	public void iShouldSeeTheElectronicsCategory() throws InterruptedException {
//		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(), "Electronics category not displayed");
//		Thread.sleep(3000);
//		logger.info("Electronics Category displayed");
//	}
//
//	@Then("I should Click on Electronics Category")
//	public void iShouldClickOnElectronicsCategory() throws InterruptedException {
//		loginPge.Electronics_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See Electronics product")
//	public void iShouldSeeElectronicsProduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(), "Electronics product not displayed");
//		Thread.sleep(3000);
//		logger.info("Electronics product displayed");
//	}
//
//	@Given("I should see the Vehicles category")
//	public void iShouldSeeTheVehiclesCategory() throws InterruptedException {
//		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(), "Vehicles category not displayed");
//		logger.info("Vehicles Category displayed");
//	}
//
//	@Then("I should Click on Vehicles Category")
//	public void iShouldClickOnVehiclesCategory() throws InterruptedException {
//		loginPge.Vehicles_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See Vehicles product")
//	public void iShouldSeeVehiclesProduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(), "Vehicles product not displayed");
//		Thread.sleep(3000);
//		logger.info("Vehicles product displayed");
//	}
//
//	@Given("I should see the Property category")
//	public void iShouldSeeThePropertyCategory() {
//		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "Property category not displayed");
//		logger.info("Property Category displayed");
//	}
//
//	@Then("I should Click on Property Category")
//	public void iShouldClickOnPropertyCategory() throws InterruptedException {
//		loginPge.Property_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See Property product")
//	public void iShouldSeePropertyProduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
//		Thread.sleep(3000);
//		logger.info("Property product displayed");
//	}
//}
