package com.automation.steps;

import com.automation.pages.AdminPage;
import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserManagementSteps {

    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();

    @When("user click on admin link")
    public void user_click_on_admin_link() {
       homePage.ClickOnAdmin();
    }

    @When("user clicks on add")
    public void user_clicks_on_add() {
       adminPage.clickOnAdd();
    }

    @Then("user selects ESS Role")
    public void user_selects_ess_role() {
       adminPage.clickOnRoles();
       adminPage.selectRoleESS();
    }

    @Then("user selects employee name {string}")
    public void user_selects_employee_name(String name) throws InterruptedException {
       adminPage.SelectEmployeeName(name);
    }

    @Then("user selects status Enable")
    public void user_selects_status_enable() {
        adminPage.clickOnStatus();
        adminPage.selectStatus();
    }

    @Then("user inputs username {string}")
    public void user_inputs_username(String username) {
       adminPage.enterUsername(username);
    }

    @Then("user inputs password and confirm password {string}")
    public void user_inputs_password_and_confirm_password(String password) {
       adminPage.enterPassword(password);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
       adminPage.clickOnSave();
    }

    @Then("Verify the success message is displayed")
    public void verify_the_success_message_is_displayed() throws InterruptedException {
       Assert.assertTrue(adminPage.isSuccessMsgDisplayed());
       Thread.sleep(10000);
    }

    @Then("search new user with username {string}")
    public void search_new_user_with_username(String name) {
       adminPage.EnterSearchNameInput(name);
    }

    @Then("search new user with role ESS")
    public void search_new_user_with_role_ess() {
       adminPage.clickOnSearchRoles();
       adminPage.selectSearchRole();
    }

    @Then("search new user with employee name {string}")
    public void search_new_user_with_employee_name(String name) {
       adminPage.selectSearchEmployeeName(name);
    }

    @Then("search new user with status enable")
    public void search_new_user_with_status_enable() {
       adminPage.selectSearchStatus();
    }

    @Then("click on search button")
    public void click_on_search_button() {
        adminPage.clickOnSearch();
    }

    @Then("verify new user record is displayed")
    public void verify_new_user_record_is_displayed() {
       Assert.assertTrue(adminPage.isRecordFound());
    }

    @Then("click on delete icon")
    public void click_on_delete_icon() {
       adminPage.clickOnDeleteIcon();
    }

    @Then("click on yes delete")
    public void click_on_yes_delete() {
       adminPage.clickOnDeleteBtn();
    }

    @Then("verify successfully deleted message is displayed")
    public void verify_successfully_deleted_message_is_displayed() {
       Assert.assertTrue(adminPage.isDeleteMsgDisplayed());
    }
    
    
}
