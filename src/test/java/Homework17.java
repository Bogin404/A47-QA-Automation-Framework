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

        allSongsPage
                .searchSongName("pluto")
                .clickViewAll()
                .clickFirstSong()
                .clickAddTo()
                .enterNewPlaylistName("new playlist17")
                .selectSavePlaylist();

        Assert.assertTrue(allSongsPage.verifySuccessMessageText().isDisplayed());

    }

}
