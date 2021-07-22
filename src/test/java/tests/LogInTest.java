package tests;


import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LogInTest extends BaseTest{

    public LoginPage loginPage;

    @Test
    public void logInTest() {
        loginPage = new LoginPage(driver);

        loginPage.login();

        // test assert
        try {
            loginPage.verifyLogin("PRODUCTS");
            System.out.println("User is logged in");
        } catch (Exception e) {
            Assert.fail("User is not logged in");
        }
    }
}

