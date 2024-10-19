package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;


public class LogInLogOutSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("user opens website")
    public void user_opens_website() {
        loginPage.openWebsite();
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("verify user is successfully logged in")
    public void verify_user_is_successfully_logged_in() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }



    @When("user clicks on user dropdown menu")
    public void user_clicks_on_user_dropdown_menu() {
        homePage.ClickOnUserDropdown();
    }

    @When("user clicks on log out")
    public void user_clicks_on_log_out() {
        homePage.ClickOnLogOut();
    }

    @Then("verify user is successfully logged out")
    public void verify_user_is_successfully_logged_out() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }



}
