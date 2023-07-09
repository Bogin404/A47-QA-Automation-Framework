import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest{
    @Test
    public void renamePlaylist(){
        String newName="renamed playlist228";
        enterEmail("popapipa@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        doubleClickPlaylist();
        renameExistingPlaylist(newName);
        verifyPlaylistIsRenamed();


    }



    private void verifyPlaylistIsRenamed() {
        WebElement successRenamed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        Assert.assertTrue(successRenamed.isDisplayed());


    }

    private void renameExistingPlaylist(String newName) {
        WebElement playlistRenameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        playlistRenameField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        playlistRenameField.sendKeys(newName);
        playlistRenameField.sendKeys(Keys.ENTER);

    }

    private void doubleClickPlaylist() {
        WebElement existingPlaylist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='#!/playlist/63355']")));
        actions.doubleClick(existingPlaylist).perform();
    }
}
