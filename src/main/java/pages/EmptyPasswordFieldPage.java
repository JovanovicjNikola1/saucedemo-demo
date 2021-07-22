package pages;


import methods.EmptyPasswordFieldMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class EmptyPasswordFieldPage extends BasePage{
    public EmptyPasswordFieldPage(WebDriver driver) {
        super(driver);
    }
    public EmptyPasswordFieldMethod method;

    public EmptyPasswordFieldPage loginEmptyPassword() {
        method = new EmptyPasswordFieldMethod(driver);
        method.loginWithEmptyPassword(PropertyManager.getInstance().getLogin_username());
        return this;
    }

    // Verification
    public EmptyPasswordFieldPage verifyLoginEmptyPassword() {
        method = new EmptyPasswordFieldMethod(driver);
        method.verifyLoginWithEmptyPassword("Epic sadface: Password is required");
        return this;
    }
}

