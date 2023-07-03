import org.testng.annotations.Test;

public class Homework17 extends BaseTest{
    @Test
    public void addSongToPlaylist() throws InterruptedException{
        openLoginURL();

        enterEmail("popapipa@gmail.com");

        enterPassword("te$t$tudent");

        clickSubmit();

        Thread.sleep(2000);

        searchSongName("pluto");

        Thread.sleep(2000);

        clickViewAll();
        Thread.sleep(2000);

        clickFirstSong();

        clickAddTo();

        enterNewPlaylistName("new playlist17");

        selectSavePlaylist();

        Thread.sleep(2000);

        verifySuccessMessageText();
        




    }


}
