package com.trycloud.step_definitions;

import com.trycloud.pages.Login;
import com.trycloud.pages.MainModules;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class US2stepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String string, String string2) {

    }
    @Then("Verify user launched to the dashboard")
    public void verify_user_launched_to_the_dashboard() {

    }
    @Then("Verify the user sees the following modules")
    public void verify_the_user_sees_the_following_modules(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("TEST user logs out")
    public void test_user_logs_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
