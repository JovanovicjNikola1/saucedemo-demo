package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.EmptyPasswordFieldPage;

public class EmptyPasswordFieldTest extends BaseTest{

    public EmptyPasswordFieldPage emptyPasswordFieldPage;

    @Test
    public void emptyPasswordTest() {
        emptyPasswordFieldPage = new EmptyPasswordFieldPage(driver);

        emptyPasswordFieldPage.loginEmptyPassword();

        // test assert
        try {
            emptyPasswordFieldPage.verifyLoginEmptyPassword();
            System.out.println("User is not logged in.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}

