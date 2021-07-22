package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPage extends CheckOutPage {
    public BuyItemPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginPage;
    By addToCartBy = By.id("add-to-cart-sauce-labs-backpack");
    By cartListBy = By.className("shopping_cart_link");
    By checkoutItemBy = By.id("checkout");
    By continueButton = By.id("continue");
    By finishButtonBy = By.id("finish");
    By orderPageBy = By.xpath("/html/body/div/div/div/div[2]/h2");


    public BuyItemPage buyItem() {
        click(addToCartBy);
        click(cartListBy);
        click(checkoutItemBy);
        fillCheckOutForm("Dragana", "Mitrovic", "11000");
        click(continueButton);
        click(finishButtonBy);


        return this;
    }
    public BuyItemPage verifyBuyItem(String expectedText) {
        String text = getText(orderPageBy);
        assertStringEquals(text, expectedText);
        return this;

    }
    }


