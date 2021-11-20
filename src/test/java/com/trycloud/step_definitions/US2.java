package com.trycloud.step_definitions;

import com.trycloud.pages.Homepage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US2 {

    Homepage homepage = new Homepage();
    @Then("Verify the user sees the following modules")
    public void verify_the_user_sees_the_following_modules(List<String> modules) {
        System.out.println("homepage.actualModules() = " + homepage.actualModules());
        boolean result = false;
        for (int i = 0; i < modules.size() ; i++) {
           if (homepage.actualModules().get(i).contains(modules.get(i))){
               result = true;
           }else {
               result = false;
           }

           assertTrue(result);
        }


    }



}
