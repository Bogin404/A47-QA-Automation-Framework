import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Homework21 extends BaseTest{
    @Test
    public void renamePlaylist(){
        String newName="renamed playlist228";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();

        //update existingPlaylist locator each time before running
        homePage.doubleClickPlaylist().renameExistingPlaylist(newName);
        Assert.assertTrue(homePage.verifyPlaylistIsRenamed().isDisplayed());


    }


}
