package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropdown;

    @FindBy(xpath = "//a[normalize-space(text())='Logout']")
    WebElement logOutBtn;

    @FindBy(xpath = "//span[text()='Admin']" )
    WebElement AdminBtn;


    public boolean isHomePageDisplayed(){ wait.until(ExpectedConditions.visibilityOf(userDropdown)); return userDropdown.isDisplayed();}

    public void ClickOnUserDropdown(){ userDropdown.click();}

    public void ClickOnLogOut(){ logOutBtn.click();}

    public void ClickOnAdmin(){ AdminBtn.click();}

}
