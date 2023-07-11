package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

    By userAvatarIcon = By.cssSelector("img.avatar");
    By progressBar = By.cssSelector("[class='plyr__progress--played']");
    By playControl = By.cssSelector("span[class='play']");
    By playNextControl = By.cssSelector("footer div i.next");
    By successRenamed = By.cssSelector(".success.show");
    By playlistRenameField = By.cssSelector("[name='name']");
    By existingPlaylist = By.cssSelector("[href='#!/playlist/63202']");

    public WebElement getUserAvatar(){
        return findElement(userAvatarIcon);
    }
    public WebElement verifySongPlaying() {
        return findElement(progressBar);
    }
    public void clickPlay() {
        findElement(playControl).click();
    }
    public void clickPlayNext() {
        findElement(playNextControl).click();
    }
    public WebElement verifyPlaylistIsRenamed() {
        return findElement(successRenamed);
    }

    public void renameExistingPlaylist(String newName) {
        findElement(playlistRenameField).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        findElement(playlistRenameField).sendKeys(newName);
        findElement(playlistRenameField).sendKeys(Keys.ENTER);
    }

    public void doubleClickPlaylist() {
        actions.doubleClick(findElement(existingPlaylist)).perform();
    }
}
