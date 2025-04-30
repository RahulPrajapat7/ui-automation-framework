package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

public class LoginPage {

    // Selenide locators
    private final SelenideElement usernameField = $x("//input[@name='username']");
    private final SelenideElement passwordField = $x("//input[@name='password']");
    private final SelenideElement loginButton   = $x("//button[@type='submit']");
    private final SelenideElement dashboardHeader = $x("//h6[text()='Dashboard']");

    // Opens the login page
    public void openLoginPage() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    // Enters username
    public void enterUsername(String username) {
        usernameField.shouldBe(visible).setValue(username);
    }

    // Enters password
    public void enterPassword(String password) {
        passwordField.shouldBe(visible).setValue(password);
    }

    // Clicks login
    public void clickLogin() {
        loginButton.shouldBe(enabled).click();
    }

    // Checks if dashboard is visible
    public boolean isDashboardVisible() {
        return dashboardHeader.shouldBe(visible).isDisplayed();
    }
}
