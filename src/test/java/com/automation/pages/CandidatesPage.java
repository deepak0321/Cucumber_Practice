package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CandidatesPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement searchName;

    @FindBy(xpath = "(//div[@role='option']//span)[1]")
    WebElement selectName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchBtn;

    @FindBy(xpath = "(//div[@role='cell'])[3]")
    WebElement searchResult;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteIcon;

    @FindBy(xpath = "//button[contains(.,'Yes, Delete')]")
    WebElement deleteBtn;

    @FindBy(className = "oxd-toast-start")
    WebElement deleteMsg;

    public void EnterSearchName(String name){ searchName.sendKeys(name); }

    public void SelectSearchName(){ selectName.click();}

    public void ClickOnSearch(){ searchBtn.click();}

    public String isRecordsFound(){ return searchResult.getText();}

    public void ClickOnDeleteIcon(){ deleteIcon.click();}

    public void ClickOnYesDelete(){ deleteBtn.click();}

    public boolean isSuccessfullyDeleted(){ WebElement msg = wait.until(ExpectedConditions.visibilityOf(deleteMsg)); return msg.isDisplayed();}








}
