import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void LoginValidEmailPasswordTest() {

        enterEmail("popapipa@gmail.com");

        enterPassword("te$t$tudent");

        clickSubmit();

        WebElement avatar = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".avatar")));
        Assert.assertTrue(avatar.isDisplayed());

    }


    @Test
    public static void LoginEmptyEmailPasswordTest(){

        enterEmail("");

        enterPassword("te$t$tudent");

        clickSubmit();

        //assertion here
    }
}
