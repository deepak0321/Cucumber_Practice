package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(tagName = "h5")
    WebElement loginText;

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(tagName = "button")
    WebElement loginButton;


    public void openWebsite() {driver.get(ConfigReader.getConfigValue("application.url"));}

    public boolean isLoginPageDisplayed(){ return loginText.isDisplayed();}

    public void enterUsername(String name){ username.sendKeys(name);}

    public void enterPassword(String pass){ password.sendKeys(pass);}

    public void clickLogin(){ loginButton.click();}



}
