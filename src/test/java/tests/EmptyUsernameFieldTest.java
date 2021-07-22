package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.EmptyUsernameFieldPage;

public class EmptyUsernameFieldTest extends BaseTest {

    public EmptyUsernameFieldPage emptyUsernameFieldPage;

    @Test
    public void emptyUsernameTest() {
        emptyUsernameFieldPage = new EmptyUsernameFieldPage(driver);

        emptyUsernameFieldPage.loginEmptyUsername();

        // test assert
        try {
            emptyUsernameFieldPage.verifyLoginEmptyUsername();
            System.out.println("User is not logged in.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
