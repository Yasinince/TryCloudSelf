package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.Homepage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US3 {

    Homepage homepage = new Homepage();
    FilesPage filesPage = new FilesPage();

    @Then("User click Files module")
    public void user_click_files_module() {
     homepage.clickModule("Files");
    }
    @Then("Verify the page title is {string}")
    public void verify_the_page_title_is(String expected) {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        assertEquals(expected,actualTitle);
    }

    @Then("click the checkbox of the table")
    public void click_the_checkbox_of_the_table() {
        BrowserUtils.waitFor(3);
        filesPage.clickCheckBox();
    }
    @Then("Assert all the files are selected")
    public void assert_all_the_files_are_selected() {
        assertTrue(filesPage.checkAllBoxVerify(filesPage.allCheckBoxes));
    }


}
