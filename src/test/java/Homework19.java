import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
    @Test
    public void deletePlaylist(){
        enterEmail("popapipa@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickPlaylist();
        removePlaylist();
        Assert.assertTrue(verifyConfirmationText().contains("new playlist17"));

    }

}
