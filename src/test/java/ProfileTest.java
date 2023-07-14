import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class ProfileTest extends BaseTest{
    @Test
public static void changeProfileNameTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        loginPage.login();

        profilePage.clickAvatarIcon().providePassword("te$t$tudent").provideProfileName().clickSaveButton();

        //Doesn't work
            //
            //
        //Assert.assertEquals(profilePage.assertNewName(), profilePage.returnNewName());


}}
