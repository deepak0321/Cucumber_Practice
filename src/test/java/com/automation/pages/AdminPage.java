package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminPage extends BasePage {

    @FindBy(xpath = "//button[contains(.,'Add')]")
    WebElement AddBtn;

    @FindBy(xpath = "(//div[@class='oxd-select-text--after']//i)[1]" )
    WebElement Roles;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[3]")
    WebElement EssRole;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement EmployeeNames;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-option'][1]")
    WebElement selectEmployee;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement status;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    WebElement statusEnabled;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameInput;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    @FindBy(css = ".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    WebElement successMsg;


    public void clickOnAdd(){ AddBtn.click();}

    public void clickOnRoles(){ Roles.click();}

    public void selectRoleESS(){ EssRole.click();}

    public void SelectEmployeeName(String name) throws InterruptedException { EmployeeNames.sendKeys(name); Thread.sleep(2000); WebElement employee = wait.until(ExpectedConditions.visibilityOf(selectEmployee)); employee.click();}

    public void clickOnStatus(){ status.click();}

    public void selectStatus(){ WebElement enabled = wait.until(ExpectedConditions.visibilityOf(statusEnabled)); enabled.click();}

    public void enterUsername(String name){ usernameInput.sendKeys(name);}

    public void enterPassword(String pass){ password.sendKeys(pass); confirmPassword.sendKeys(pass);}

    public void clickOnSave(){ saveBtn.click();}

    public boolean isSuccessMsgDisplayed(){ WebElement SuccessMsg = wait.until(ExpectedConditions.visibilityOf(successMsg));return SuccessMsg.isDisplayed();}

// ---------------------------------------------------------------------------------

    @FindBy(xpath = "//h5[text()='System Users']")
    WebElement searchDiv;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement searchNameInput;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    WebElement searchRoles;

    @FindBy(xpath = "(//div[@role='option'])[3]")
    WebElement searchRoleSelect;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement searchEmployeeNameInput;

    @FindBy(xpath = "(//div[@role='option']//span)[1]")
    WebElement searchEmployeeNameSelect;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement searchStatus;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    WebElement searchStatusSelect;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchBtn;

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
    WebElement searchResult;


    public void EnterSearchNameInput(String name){ wait.until(ExpectedConditions.visibilityOf(searchDiv));searchNameInput.sendKeys(name);}

    public void clickOnSearchRoles(){ searchRoles.click();}

    public void selectSearchRole(){ searchRoleSelect.click();}

    public void selectSearchEmployeeName(String username){ searchEmployeeNameInput.sendKeys(username);  WebElement  nameSelect = wait.until(ExpectedConditions.visibilityOf(searchEmployeeNameSelect)); nameSelect.click();}

    public void selectSearchStatus(){ searchStatus.click(); searchStatusSelect.click();}

    public void clickOnSearch(){ searchBtn.click();}

    public boolean isRecordFound(){ WebElement records = wait.until(ExpectedConditions.visibilityOf(searchResult)); return  records.isDisplayed();}

    // -----------------------------------------------------------------------------------------

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteIcon;

    @FindBy(xpath = "//button[contains(.,'Yes, Delete')]")
    WebElement deleteBtn;

    @FindBy(css = ".oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    WebElement deleteMsg;

    public void clickOnDeleteIcon(){ deleteIcon.click();}

    public void clickOnDeleteBtn(){ deleteBtn.click();}

    public boolean isDeleteMsgDisplayed(){ WebElement DeleteMsg = wait.until(ExpectedConditions.visibilityOf(deleteMsg));return DeleteMsg.isDisplayed();}









}
