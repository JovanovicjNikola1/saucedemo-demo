package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LogInMethod extends BasePage {
    public LogInMethod(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By productPageBy = By.className("title");
    By burgerMenuButtonBy = By.id("react-burger-menu-btn");
    By logOutLinkBy = By.id("logout_sidebar_link");


    public LogInMethod login(String username, String password) {
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LogInMethod verifyLogin(String expectedText) {
        String title = readText(productPageBy);
        assertStringEquals(title, expectedText);
        return this;

    }

    public LogInMethod logout() {
        click(burgerMenuButtonBy);
        click(logOutLinkBy);
        return this;
    }
}

