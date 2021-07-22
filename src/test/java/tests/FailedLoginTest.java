package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class FailedLoginTest extends BaseTest{

    public LoginPage logInPage;

    @Test
    public void failedLogin(){
        logInPage = new LoginPage(driver);
        logInPage.failedLogin();

        try {
            logInPage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
            System.out.println("User is not logged in");
        } catch (Exception e) {
            Assert.fail("USER Is logged in!");
        }
    }
    }



