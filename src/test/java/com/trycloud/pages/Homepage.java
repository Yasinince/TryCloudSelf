package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Homepage {

    @FindBy(xpath = "(//span[@class='unified-search__result-content'])[3]")
    public WebElement searchResult;

    @FindBy(css = "svg[viewBox~='24']")
    public WebElement searchIcon;

    @FindBy(xpath = "(//input)[23]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    private WebElement logoutDrop;

    @FindBy(xpath = "//li[@ data-id='logout']")
    private WebElement logoutBtn;

    @FindBy(xpath = "//li[@data-id='dashboard']/a")
    private WebElement dashBoardBtn;

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement textDashBoardBtn;

    @FindBy(xpath = "//li[@data-id='files']/a")
    private WebElement filesBtn;

    @FindBy(xpath = "//span[text()='Files']")
    private WebElement textFilesBtn;

    @FindBy(xpath = "//li[@data-id='photos']/a")
    private WebElement photosBtn;

    @FindBy(xpath = "//span[text()='Photos']")
    private WebElement textPhotosBtn;

    @FindBy(xpath = "//li[@data-id='activity']/a")
    private WebElement activityBtn;

    @FindBy(xpath = "//span[text()='Activity']")
    private WebElement textActivityBtn;

    @FindBy(xpath = "//li[@data-id='spreed']/a")
    private WebElement talkBtn;

    @FindBy(xpath = "//span[text()='Talk']")
    private WebElement textTalkBtn;

    @FindBy(xpath = "//li[@data-id='contacts']/a")
    private WebElement contactsBtn;

    @FindBy(xpath = "//li[@data-id='circles']/a")
    private WebElement circlesBtn;

    @FindBy(xpath = "//span[text()='Contacts']")
    private WebElement textContactBtn;

    @FindBy(xpath = "//li[@data-id='calendar']/a")
    private WebElement calendarBtn;

    @FindBy(xpath = "//span[text()='Calendar']")
    private WebElement textCalendarBtn;

    @FindBy(xpath = "//li[@data-id='deck']/a")
    private WebElement deckBtn;

    @FindBy(xpath = "//span[text()='Calendar']")
    private WebElement textDeckBtn;

    @FindBy(xpath = "//div[contains(@style, 'folder.svg')]")
    public List<WebElement> foldersList;

    @FindBy(xpath = "//li[starts-with(@class, 'nav-files')]")
    private WebElement allFilesFol;

    @FindBy(xpath = "//label[@for='select_all_files']")
    private WebElement allCheckbox;

   public Homepage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   public List<String> actualModules(){

       List<String> list =new ArrayList<>();

       //list.add(dashBoardBtn.getAttribute("href"));
       list.add(dashBoardBtn.getText());
       //list.add(filesBtn.getAttribute("href"));
       list.add(filesBtn.getText());
       //list.add(photosBtn.getAttribute("href"));
       list.add(photosBtn.getText());
       //list.add(activityBtn.getAttribute("href"));
       list.add(activityBtn.getText());
      // list.add(talkBtn.getAttribute("href"));
       list.add(talkBtn.getText());
       //list.add(contactsBtn.getAttribute("href"));
       list.add(contactsBtn.getText());
      // list.add(circlesBtn.getAttribute("href"));
       list.add(circlesBtn.getText());
       //list.add(calendarBtn.getAttribute("href"));
       list.add(calendarBtn.getText());
      // list.add(deckBtn.getAttribute("href"));
       list.add(deckBtn.getText());

       return list;
   }

   public void clickModule(String moduleName){
       switch (moduleName){
           case"Dashboard":
               dashBoardBtn.click();
               break;
           case"Files":
               filesBtn.click();
               break;
           case"Photos":
               photosBtn.click();
               break;
           case"Activity":
               activityBtn.click();
               break;
           case"Talk":
               talkBtn.click();
               break;
           case"Mail":
               textTalkBtn.click();
               break;
           case "Contacts":
               contactsBtn.click();
               break;
           case"Circles":
               circlesBtn.click();
               break;
           case"Calendar":
               calendarBtn.click();
               break;
           case"Deck":
               deckBtn.click();
               break;
           default:
               System.out.println("Please try valid module name");
       }
   }

   public void actualFilesTitle(){

   }





}
