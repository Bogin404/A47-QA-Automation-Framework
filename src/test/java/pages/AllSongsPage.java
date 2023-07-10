package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllSongsPage extends BasePage{
    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By successNewPlaylist = By.xpath("//div[contains(text(), 'new playlist17')]");
    By savePlaylistButton = By.xpath("//*[@id='songResultsWrapper']//button[@title='Save']");
    By createPlaylistField = By.xpath("//*[@id='songResultsWrapper']//input[@data-test='new-playlist-name']");
    By addToButton = By.cssSelector("[class='btn-add-to']");
    By firstSong = By.xpath("(//*[@id='songResultsWrapper']//tr[contains(@class,'song-item')])[1]");
    By viewAllButton = By.cssSelector("[data-test='view-all-songs-btn']");
    By searchField = By.cssSelector("[name='q']");



    public WebElement verifySuccessMessageText() {
        return findElement(successNewPlaylist);
    }
    public void selectSavePlaylist() {
        findElement(savePlaylistButton).click();
    }
    public void enterNewPlaylistName(String newPlaylistName) {
        findElement(createPlaylistField).click();
        findElement(createPlaylistField).sendKeys(newPlaylistName);
    }
    public void clickAddTo() {
        findElement(addToButton).click();
    }
    public void clickFirstSong() {
        findElement(firstSong).click();
    }
    public void clickViewAll() {
        findElement(viewAllButton).click();
    }
    public void searchSongName(String songName) {
        findElement(searchField).click();
        findElement(searchField).sendKeys(songName);
    }
}
