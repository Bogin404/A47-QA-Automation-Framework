import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{
    @Test
public static void changeProfileNameTest() throws InterruptedException{
    openLoginURL();

    enterEmail("popapipa@gmail.com");

    enterPassword("te$t$tudent");

    clickSubmit();

        Thread.sleep(2000);


        clickAvatarIcon();

   String randomName = generateRandomName();

   providePassword("te$t$tudent");

   provideProfileName(randomName);

   clickSaveButton();

   Thread.sleep(2000);

   WebElement actualProfileName = driver.findElement(By.cssSelector("a.view-profile>span"));
   Assert.assertEquals(actualProfileName.getText(), randomName);
}}
