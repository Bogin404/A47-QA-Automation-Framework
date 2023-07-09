import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{
    @Test
public static void changeProfileNameTest() {

    enterEmail("popapipa@gmail.com");

    enterPassword("te$t$tudent");

    clickSubmit();


    clickAvatarIcon();

   String randomName = generateRandomName();

   providePassword("te$t$tudent");

   provideProfileName(randomName);

   clickSaveButton();


   WebElement actualProfileName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.view-profile>span")));
   Assert.assertEquals(actualProfileName.getText(), randomName);
}}
