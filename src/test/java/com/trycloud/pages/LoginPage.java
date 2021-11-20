package com.trycloud.pages;


import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    @FindBy(id = "user")
    private WebElement userInput;

    @FindBy(id = "password")
    private WebElement passInput;

    @FindBy(id = "submit-form")
    private WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    private WebElement wrongPassMsg;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    private WebElement logoutDrop;

    @FindBy(xpath = "//li[@ data-id='logout']")
    private WebElement logoutBtn;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void goTo() {
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void fillCredentials(String userName, String password) {
        Driver.getDriver().manage().window().maximize();
        this.userInput.sendKeys(userName);
        this.passInput.sendKeys(password);
    }

    public void clickLogin() {
        this.loginBtn.click();
    }

    public void login() {// this method only for 1 user
        goTo();
        fillCredentials(ConfigurationReader.read("user0"), ConfigurationReader.read("password"));
        clickLogin();
    }

    public void isAtLoginPage() {
        String homePage = "http://qa3.trycloud.net/index.php/apps/dashboard/";

        Assert.assertEquals(homePage, Driver.getDriver().getCurrentUrl());
    }

    public void wrongPassErrorMsgIsDisplayed() {
        Assert.assertTrue(this.wrongPassMsg.isDisplayed());
    }

    public void logout(){
        logoutDrop.click();
        logoutBtn.click();
    }

}