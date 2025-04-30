package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.openLoginPage();
        System.out.println("it was opened");
    }

    @When("the user enters valid username and password")
    public void enterCredentials() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("password123");
    }

    @And("clicks the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

//    @Then("the user should be navigated to the dashboard")
//    public void verifyDashboard() {
//        loginPage.assertDashboardVisible();
//    }
}
