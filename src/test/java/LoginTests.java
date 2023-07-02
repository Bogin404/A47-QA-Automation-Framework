import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void LoginValidEmailPasswordTest() {
        openLoginURL();

        enterEmail("popapipa@gmail.com");

        enterPassword("te$t$tudent");

        clickSubmit();

        WebElement avatar = driver.findElement(By.cssSelector(".avatar"));
        Assert.assertTrue(avatar.isDisplayed());

    }


    @Test
    public static void LoginEmptyEmailPasswordTest(){

        openLoginURL();

        enterEmail("");

        enterPassword("te$t$tudent");

        clickSubmit();

        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
