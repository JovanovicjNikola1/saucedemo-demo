package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LogOutTest extends BaseTestWithLogin{
    public LoginPage loginPage;

    @Test
    public void logoutTest(){
        loginPage = new LoginPage(driver);

        loginPage.logout();


        try {
            loginPage.verifyLogout("Login");
            System.out.print("User is logged out");
        }catch (Exception e){
            System.out.println(e);
            Assert.fail("User is not logged out");
        }
    }
}

