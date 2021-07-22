package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class EmptyUsernameFieldMethod extends BasePage {
    public EmptyUsernameFieldMethod(WebDriver driver) {
        super(driver);
    }

    By passwordBy = By.id("password");
    By loginButtonBy = By.xpath("//input[@type='submit'][@value='Login']");

    // verifications
    By errorMessageBy = By.xpath("//h3[@data-test='error'][text()='Epic sadface: Username is required']");

    public EmptyUsernameFieldMethod loginWithEmptyUsername(String password) {
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    // Verification methods
    public EmptyUsernameFieldMethod verifyLoginWithEmptyUsername(String expectedText) {
        String errorMessage = readText(errorMessageBy);
        assertStringEquals(errorMessage, expectedText);
        return this;
    }
}
