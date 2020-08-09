package com.bitrix24.step_definitions;

import com.bitrix24.Utilities.ConfigurationReader;
import com.bitrix24.Utilities.Driver;
import com.bitrix24.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User login as authorized user")
    public void user_login_as_authorized_user() {
        loginPage.login();

    }
    @Then("User should be on the main page")
    public void user_should_be_on_the_main_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"(2) Portal");

    }

}
