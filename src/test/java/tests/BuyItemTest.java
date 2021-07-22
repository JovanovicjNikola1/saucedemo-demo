package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.BasePage;
import pages.BuyItemPage;
import pages.CheckOutPage;
import pages.LoginPage;


public class BuyItemTest extends BaseTest {
    public LoginPage loginPage;
    public CheckOutPage checkOutPage;
    public BasePage basePage;
    public BuyItemPage buyItemPage;


    @Test
    public void buyItem() {

        loginPage = new LoginPage(driver);
        checkOutPage = new CheckOutPage(driver);
        basePage = new BasePage(driver);
        buyItemPage = new BuyItemPage(driver);

        checkOutPage = new CheckOutPage(driver);
        loginPage.login();


        buyItemPage.buyItem();


        
        try {
            buyItemPage.verifyBuyItem("THANK YOU FOR YOUR ORDER");
            System.out.print("CHECKOUT COMPLETE!");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }
}