package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistPage extends BasePage{

    public PlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    @FindBy(css = "div.success.show")
    WebElement successDeletedPlaylist;
    @FindBy(css = "[class='del btn-delete-playlist']")
    WebElement deletePlaylistButton;
    @FindBy(css = "[class='ok']")
    WebElement confirmDeletePlaylist;

    //update playlist locator to existing each time before running
    @FindBy(css = "[href='#!/playlist/64303']")
    WebElement playlistToDelete;

    //By successDeletedPlaylist = By.cssSelector("div.success.show");
    //By deletePlaylistButton = By.cssSelector("[class='del btn-delete-playlist']");
    //By confirmDeletePlaylist = By.cssSelector("[class='ok']");
    //By playlistToDelete = By.cssSelector("[href='#!/playlist/63872']");
    public boolean verifyConfirmationText() {
        return successDeletedPlaylist.getText().contains("Deleted playlist \"new playlist17.\"");
    }

    public PlaylistPage removePlaylist() {
        deletePlaylistButton.click();
        confirmDeletePlaylist.click();
        return this;
    }

    public PlaylistPage clickPlaylist() {
        playlistToDelete.click();
        return this;
    }
}
