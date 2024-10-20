package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RecruitmentPage extends BasePage{

    @FindBy(xpath = "//span[text()='Recruitment']")
    WebElement RecruitmentBtn;

    @FindBy(xpath = "//button[contains(.,'Add')]")
    WebElement AddBtn;

    @FindBy(name = "firstName")
    WebElement firstNameInput;

    @FindBy(name = "lastName")
    WebElement lastNameInput;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement vacancies;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    WebElement selectVacancy;

    @FindBy(xpath = "(//label[normalize-space(text())='Email']/following::input)[1]")
    WebElement emailInput;

    @FindBy(xpath = "//input[@class='oxd-file-input']")
    WebElement fileInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    @FindBy(className = "oxd-toast-start")
    WebElement successMsg;

    @FindBy(xpath = "//li[contains(.,'Candidates')]")
    WebElement CandidatesPageBtn;

    public void ClickOnRecruitment(){ RecruitmentBtn.click();}

    public void ClickOnAddBtn(){ AddBtn.click();}

    public void enterName(String fname,String lname){ firstNameInput.sendKeys(fname);lastNameInput.sendKeys(lname);}

    public void SelectVacancy(){ vacancies.click();selectVacancy.click();}

    public void enterEmail(String email){ emailInput.sendKeys(email);}

    public void uploadResume(String fileLoc){ fileInput.sendKeys(fileLoc);}

    public void ClickOnSave(){ saveBtn.click();}

    public boolean isSuccessfullySaved(){ WebElement Msg = wait.until(ExpectedConditions.visibilityOf(successMsg));return Msg.isDisplayed();}

    public void ClickOnCandidatesbtn(){ CandidatesPageBtn.click();}

}
