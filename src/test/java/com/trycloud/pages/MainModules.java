package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainModules {

    @FindBy(xpath ="//ul[@id='appmenu']" )
    private WebElement modules;

    public MainModules(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void modules(List<WebElement> actualModules){
        for (WebElement eachModules : actualModules) {
            System.out.println("eachModules.getText() = " + eachModules.getText());


        }
    }

}
