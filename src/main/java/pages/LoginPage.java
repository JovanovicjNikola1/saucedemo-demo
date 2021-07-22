package pages;

import methods.LogInMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By productPageBy = By.className("title");
    By errorNotificationBy = By.xpath("//h3[@data-test='error'][text()='Epic sadface: Username and password do not match any user in this service']");
    By logInBy = By.id("login-button");
    By burgerMenuButtonBy = By.id("react-burger-menu-btn");
    By logOutLinkBy = By.id("logout_sidebar_link");
    By shoppingCartBy = By.className("shopping_cart_link");
    By orderPageBy = By.className("complete-header");
    // By finishOrderElementBY = By.className("complete-header");

    public LogInMethod method;

    public LoginPage login() {
        method = new LogInMethod(driver);
        method.login(PropertyManager.getInstance().getLogin_username(),
                PropertyManager.getInstance().getLogin_password());
        return this;

    }

    public LoginPage failedLogin() {
        method = new LogInMethod(driver);
        method.login(PropertyManager.getInstance().getBadUsername(),
                PropertyManager.getInstance().getBadLoginPassword());
        return this;
    }

    public LoginPage logout() {
        click(burgerMenuButtonBy);
        click(logOutLinkBy);
        return this;

    }


    public LoginPage verifyLogin(String expectedText) {
        String title = readText(productPageBy);
        assertStringEquals(title, expectedText);
        return this;
    }

    public LoginPage verifyFailedLogin(String expectedText) {
        String alert = readText(errorNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }

    public LoginPage verifyLogout(String expectedText) {
        String Login = readTextByAttribute(logInBy, "value");
        assertStringEquals(Login, expectedText);
        return this;
    }

    public LoginPage verifyRemoveItem() {
        checkVisibilityElement(shoppingCartBy);
        return this;

    }



}



