package tests;

import methods.LogInMethod;
import org.junit.Assert;
import org.junit.Test;
import pages.BasePage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.RemoveItemFromCartPage;
import utilities.PropertyManager;

public class RemoveItemFromCartTest extends BaseTest {
    public RemoveItemFromCartPage removeItemFromCartPage;
    public LoginPage loginPage;
    public CheckOutPage checkOutPage;
    public BasePage basePage;

    @Test
    public void removeItemFromCart() {

        loginPage = new LoginPage(driver);
        checkOutPage = new CheckOutPage(driver);
        basePage = new BasePage(driver);

        loginPage.login();
        removeItemFromCartPage = new RemoveItemFromCartPage(driver);

        removeItemFromCartPage.removeItem();




        try {

            loginPage.verifyRemoveItem();
            System.out.print("Item is removed");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }
}
