import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest{
    @Test
    public void addSongToPlaylist() throws InterruptedException{
        openLoginURL();

        enterEmail("popapipa@gmail.com");

        enterPassword("te$t$tudent");

        clickSubmit();

        Thread.sleep(2000);

        searchSongName("pluto");

        Thread.sleep(2000);

        clickViewAll();
        Thread.sleep(2000);

        clickFirstSong();

        clickAddTo();

        enterNewPlaylistName("new playlist17");

        selectSavePlaylist();

        Thread.sleep(2000);

        verifySuccessMessageText();
        




    }

    private void verifySuccessMessageText() {
        WebElement successNewPlaylist = driver.findElement(By.xpath(
                "//div[contains(text(), 'new playlist17')]"));
        Assert.assertTrue(successNewPlaylist.isDisplayed());
    }

    private void selectSavePlaylist() {
        WebElement savePlaylistButton = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/header/div[3]/div/section[2]/form/button"));
        savePlaylistButton.click();
    }

    private void enterNewPlaylistName(String newPlaylistName) {
        WebElement createPlaylistField = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/header/div[3]/div/section[2]/form/input"));
        createPlaylistField.click();
        createPlaylistField.sendKeys(newPlaylistName);
    }

    private void clickAddTo() {
        WebElement addToButton = driver.findElement(By.cssSelector("[class='btn-add-to']"));
        addToButton.click();
    }

    private void clickFirstSong() {
        WebElement firstSong = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/div/div/div[1]/table/tr"));
        firstSong.click();
    }

    private void clickViewAll() {
        WebElement viewAllButton = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
        viewAllButton.click();

    }

    private void searchSongName(String songName) {
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.click();
        searchField.sendKeys(songName);
    }



}
