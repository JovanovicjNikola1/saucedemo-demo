package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    By continueButton = By.id("continue");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By finishButtonBy = By.id("finish");


    public CheckOutPage fillCheckOutForm(String firstName, String lastName, String postalCode) {
        writeText(firstNameField, firstName);
        writeText(lastNameField, lastName);
        writeText(postalCodeField, postalCode);
        click(continueButton);
        click(finishButtonBy);


        return this;
    }

}