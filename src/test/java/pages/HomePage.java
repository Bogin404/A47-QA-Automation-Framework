package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

    @FindBy(css = "img.avatar")
    WebElement userAvatarIcon;
    @FindBy(css = "[class='plyr__progress--played']")
    WebElement progressBar;
    @FindBy(css = "span[class='play']")
    WebElement playControl;
    @FindBy(css = "footer div i.next")
    WebElement playNextControl;
    @FindBy(css = ".success.show")
    WebElement successRenamed;
    @FindBy(css = "[name='name']")
    WebElement playlistRenameField;
    //update existingPlaylist locator each time before running

    @FindBy(css = "[href='#!/playlist/63202']")
    WebElement existingPlaylist;
    //By userAvatarIcon = By.cssSelector("img.avatar");
    //By progressBar = By.cssSelector("[class='plyr__progress--played']");
    //By playControl = By.cssSelector("span[class='play']");
    //By playNextControl = By.cssSelector("footer div i.next");
    //By successRenamed = By.cssSelector(".success.show");
    //By playlistRenameField = By.cssSelector("[name='name']");
    //By existingPlaylist = By.cssSelector("[href='#!/playlist/63202']");

    public WebElement getUserAvatar(){
        return userAvatarIcon;
    }
    public WebElement verifySongPlaying() {
        return progressBar;
    }
    public HomePage clickPlay() {
        playControl.click();
        return this;
    }
    public HomePage clickPlayNext() {
        playNextControl.click();
        return this;
    }
    public WebElement verifyPlaylistIsRenamed() {
        return successRenamed;
    }
    public HomePage renameExistingPlaylist(String newName) {
        playlistRenameField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        playlistRenameField.sendKeys(newName);
        playlistRenameField.sendKeys(Keys.ENTER);
        return this;
    }

    //update existingPlaylist locator each time before running
    public HomePage doubleClickPlaylist() {
        actions.doubleClick(existingPlaylist).perform();
        return this;
    }
}
