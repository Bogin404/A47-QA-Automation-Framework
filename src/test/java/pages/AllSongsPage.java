package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSongsPage extends BasePage{
    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    @FindBy(xpath = "//div[contains(text(), 'new playlist17')]")
    WebElement successNewPlaylist;

    @FindBy(xpath = "//*[@id='songResultsWrapper']//button[@title='Save']")
    WebElement savePlaylistButton;

    @FindBy(xpath = "//*[@id='songResultsWrapper']//input[@data-test='new-playlist-name']")
    WebElement createPlaylistField;

    @FindBy(css = "[class='btn-add-to']")
    WebElement addToButton;

    @FindBy(xpath = "(//*[@id='songResultsWrapper']//tr[contains(@class,'song-item')])[1]")
    WebElement firstSong;

    @FindBy(css = "[data-test='view-all-songs-btn']")
    WebElement viewAllButton;

    @FindBy(css = "[name='q']")
    WebElement searchField;
//    By successNewPlaylist = By.xpath("//div[contains(text(), 'new playlist17')]");
//    By savePlaylistButton = By.xpath("//*[@id='songResultsWrapper']//button[@title='Save']");
//    By createPlaylistField = By.xpath("//*[@id='songResultsWrapper']//input[@data-test='new-playlist-name']");
//    By addToButton = By.cssSelector("[class='btn-add-to']");
//    By firstSong = By.xpath("(//*[@id='songResultsWrapper']//tr[contains(@class,'song-item')])[1]");
//    By viewAllButton = By.cssSelector("[data-test='view-all-songs-btn']");
//    By searchField = By.cssSelector("[name='q']");



    public WebElement verifySuccessMessageText() {
        return successNewPlaylist;
    }
    public AllSongsPage selectSavePlaylist() {
        savePlaylistButton.click();
        return this;
    }
    public AllSongsPage enterNewPlaylistName(String newPlaylistName) {
        createPlaylistField.click();
        createPlaylistField.sendKeys(newPlaylistName);
        return this;
    }
    public AllSongsPage clickAddTo() {
        addToButton.click();
        return this;
    }
    public AllSongsPage clickFirstSong() {
        firstSong.click();
        return this;
    }
    public AllSongsPage clickViewAll() {
        viewAllButton.click();
        return this;
    }
    public AllSongsPage searchSongName(String songName) {
        //wait.until(ExpectedConditions.elementToBeClickable(searchField)).click();
        searchField.click();
        searchField.sendKeys(songName);
        return this;
    }
}
