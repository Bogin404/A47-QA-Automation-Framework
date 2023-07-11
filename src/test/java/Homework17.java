import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AllSongsPage;

public class Homework17 extends BaseTest{
    @Test
    public void addSongToPlaylist() {

        AllSongsPage allSongsPage = new AllSongsPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login();

        allSongsPage.searchSongName("pluto");

        allSongsPage.clickViewAll();

        allSongsPage.clickFirstSong();

        allSongsPage.clickAddTo();

        allSongsPage.enterNewPlaylistName("new playlist17");

        allSongsPage.selectSavePlaylist();

        Assert.assertTrue(allSongsPage.verifySuccessMessageText().isDisplayed());

    }

}
