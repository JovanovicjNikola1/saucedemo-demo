package pages;

import methods.EmptyUsernameFieldMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class EmptyUsernameFieldPage extends BasePage {
    public EmptyUsernameFieldPage(WebDriver driver) {
        super(driver);
    }

    public EmptyUsernameFieldMethod method;

    public EmptyUsernameFieldPage loginEmptyUsername() {
        method = new EmptyUsernameFieldMethod(driver);
        method.loginWithEmptyUsername(PropertyManager.getInstance().getLogin_password());
        return this;
    }

    // Verification
    public EmptyUsernameFieldPage verifyLoginEmptyUsername() {
        method = new EmptyUsernameFieldMethod(driver);
        method.verifyLoginWithEmptyUsername("Epic sadface: Username is required");
        return this;
    }
}
