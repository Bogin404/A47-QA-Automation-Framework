import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PlaylistPage;

public class Homework19 extends BaseTest{
    @Test
    public void deletePlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.login();

        playlistPage.clickPlaylist();
        playlistPage.removePlaylist();
        Assert.assertTrue(playlistPage.verifyConfirmationText());

    }

}
