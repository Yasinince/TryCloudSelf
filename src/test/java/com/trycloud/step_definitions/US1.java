package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1 {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
     loginPage.goTo();
    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
       loginPage.fillCredentials(username,password);
    }
    @When("user click login button")
    public void user_click_login_button() {
     loginPage.clickLogin();
        BrowserUtils.waitFor(5);
    }
    @Then("Verify user launched to the dashboard")
    public void verify_user_launched_to_the_dashboard() {
        loginPage.isAtLoginPage();
    }
    @Then("TEST user logs out")
    public void test_user_logs_out() {
        loginPage.logout();
    }

    @When("user enter invalid credentials")
    public void user_enter_invalid_credentials() {
        loginPage.fillCredentials("abcdfg","123abc");
    }
    @Then("“Wrong username or password.” message should be displayed")
    public void wrong_username_or_password_message_should_be_displayed() {
       loginPage.wrongPassErrorMsgIsDisplayed();
    }



}
