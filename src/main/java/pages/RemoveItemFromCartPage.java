package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;

public class RemoveItemFromCartPage extends BasePage {
    public RemoveItemFromCartPage(WebDriver driver) {
        super(driver);
    }


    By addToCartBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeButtonBy = By.id("remove-sauce-labs-backpack");

    public RemoveItemFromCartPage removeItem() {
        click(addToCartBy);
        click(removeButtonBy);
        return this;
    }
    public BasePage basePage;


    public boolean checkVisibilityElement(By elementBy) {
        try {
            driver.findElement(elementBy);
            System.out.print("item is visible");

            return true;
        } catch (ElementNotVisibleException e) {
            System.out.print("item is not visible");
            return false;

        }


    }
}