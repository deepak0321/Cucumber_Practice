package com.automation.steps;

import com.automation.pages.CandidatesPage;
import com.automation.pages.RecruitmentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CandidateRegistrationSteps {

    RecruitmentPage recruitmentPage = new RecruitmentPage();
    CandidatesPage candidatesPage = new CandidatesPage();

    @When("user clicks on Recruitment")
    public void user_clicks_on_recruitment() {
        recruitmentPage.ClickOnRecruitment();
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        recruitmentPage.ClickOnAddBtn();
    }

    @When("user inputs FirstName {string} and LastName {string}")
    public void user_inputs_first_name_and_last_name(String fname, String lname) {
        recruitmentPage.enterName(fname,lname);
    }

    @When("user selects JAA vacancy")
    public void user_selects_jaa_vacancy() {
        recruitmentPage.selectVacancyJAA();
    }

    @When("user inputs Email {string}")
    public void user_inputs_email(String email) {
        recruitmentPage.enterEmail(email);
    }

    @Then("user uploads doc resume file {string}")
    public void user_uploads_doc_resume_file(String fileloc) {
        recruitmentPage.uploadResume(fileloc);
    }

    @Then("user clicks on save")
    public void user_clicks_on_save() {
        recruitmentPage.ClickOnSave();
    }

    @Then("verify successfully saved message")
    public void verify_successfully_saved_message() {
        Assert.assertTrue(recruitmentPage.isSuccessfullySaved());
    }

    @Then("user search using name {string}")
    public void user_search_using_name(String name) {
        recruitmentPage.ClickOnCandidatesbtn();
        candidatesPage.EnterSearchName(name);
        candidatesPage.SelectSearchName();
    }

    @Then("user click on search")
    public void user_click_on_search() {
        candidatesPage.ClickOnSearch();
    }

    @Then("verify candidate record is displayed")
    public void verify_candidate_record_is_displayed() {
        Assert.assertEquals(candidatesPage.isRecordsFound(),"Deepak Raj");
    }




}
