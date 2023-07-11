package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaylistPage extends BasePage{

    public PlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By successDeletedPlaylist = By.cssSelector("div.success.show");
    By deletePlaylistButton = By.cssSelector("[class='del btn-delete-playlist']");
    By confirmDeletePlaylist = By.cssSelector("[class='ok']");
    //update playlist locator to existing each time before running
    By playlistToDelete = By.cssSelector("[href='#!/playlist/63872']");
    public boolean verifyConfirmationText() {
        return findElement(successDeletedPlaylist).getText().contains("Deleted playlist \"new playlist17.\"");
    }

    public void removePlaylist() {
        findElement(deletePlaylistButton).click();


        findElement(confirmDeletePlaylist).click();
    }

    public void clickPlaylist() {

        findElement(playlistToDelete).click();

    }
}
