package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class EmptyPasswordFieldMethod extends BasePage {
    public EmptyPasswordFieldMethod(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.id("user-name");
    By loginButtonBy = By.id("login-button");

    // verifications
    By errorMessageBy = By.xpath("//h3[@data-test='error'][text()='Epic sadface: Password is required']");

    public EmptyPasswordFieldMethod loginWithEmptyPassword(String username) {
        writeText(usernameBy, username);
        click(loginButtonBy);
        return this;
    }

    // Verification methods
    public EmptyPasswordFieldMethod verifyLoginWithEmptyPassword(String expectedText) {
        String errorMessage = readText(errorMessageBy);
        assertStringEquals(errorMessage, expectedText);
        return this;
    }
}


