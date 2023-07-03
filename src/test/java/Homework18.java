import org.testng.annotations.Test;

public class Homework18 extends BaseTest{
    @Test
    public void playSong(){
        openLoginURL();
        enterEmail("popapipa@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickPlayNext();
        clickPlay();
        verifySongPlaying();

    }

}
