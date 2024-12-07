package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pages.LoginPage;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openLoginPage();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials(String username, String password) {
        loginPage.enterDetails(username, password, true, true);
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        Assert.assertTrue(loginPage.errorMessage().isDisplayed());
        Assert.assertTrue(loginPage.errorMessage().getText().contains("check"));
        Assert.assertEquals(loginPage.errorMessage().getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
    }
}
