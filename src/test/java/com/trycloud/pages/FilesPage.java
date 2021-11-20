package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@data-id='files']/a")
    private WebElement filesBtn;

    @FindBy(xpath = "(//th[@id='headerSelection'])[1]")
    private WebElement checkBox;

    @FindBy(xpath = "//td[@class='selection']/input")
    public List <WebElement> allCheckBoxes;

    public void clickFilesBtn(){
        filesBtn.click();
        BrowserUtils.waitFor(3);
    }

    public void clickCheckBox(){
        checkBox.click();
    }

    public void verifyCheckBox(){
        checkBox.isSelected();
    }

    public boolean checkAllBoxVerify(List<WebElement> allBoxes) {
        for (WebElement eachBox : allBoxes) {
            if (eachBox.isSelected()) {
                return true;
            }

        }
        return false;

    }
}
