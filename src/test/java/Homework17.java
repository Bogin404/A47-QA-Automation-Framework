import org.testng.annotations.Test;

public class Homework17 extends BaseTest{
    @Test
    public void addSongToPlaylist() {

        enterEmail("popapipa@gmail.com");

        enterPassword("te$t$tudent");

        clickSubmit();

        searchSongName("pluto");


        clickViewAll();

        clickFirstSong();

        clickAddTo();

        enterNewPlaylistName("new playlist17");

        selectSavePlaylist();


        verifySuccessMessageText();
        




    }


}
