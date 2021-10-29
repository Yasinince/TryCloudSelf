package com.trycloud.step_definitions;

import com.trycloud.pages.Login;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDef {

    Login login = new Login();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        login.goTo();
    }


    @When("user use username {string} and passcode “Userpass123\"")
    public void user_use_username_and_passcode_userpass123(String string) {
        login.login(string,"Userpass123");
    }

    @When("user click login button")
    public void user_click_login_button() {

    }

    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {
       String expected = Driver.getDriver().getTitle();
       String actual = "Dashboard - Trycloud QA";
       assertEquals(expected,actual);
    }

    @When("user enter invalid credentials")
    public void user_enter_invalid_credentials() {
        login.login("yasinn","123456");
    }

    @When("click login button")
    public void click_login_button() {

    }

    @Then("“Wrong username or password.” message should be displayed")
    public void wrong_username_or_password_message_should_be_displayed() {
        BrowserUtils.waitFor(3);
        login.wrongCredentials();

    }
}



