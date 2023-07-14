import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.UUID;



public class BaseTest {
    public static WebDriver driver = null;
    public static String url;
    public static WebDriverWait wait;
    public static Actions actions;

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    @Parameters({"BaseURL"})
            public void launchBrowser(String BaseURL) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        url = BaseURL;
        driver.get(url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        actions = new Actions(driver);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

//    protected static void clickSubmit() {
//        WebElement submitLogin = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("button[type='submit']")));
//        submitLogin.click();
//    }
//
//    protected static void enterPassword(String password) {
//        WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[type='password']")));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
//    }
//
//    protected static void enterEmail(String email) {
//        WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[type='email']")));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
//
//    }



//    protected static void clickAvatarIcon(){
//        WebElement avatarIcon = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("img.avatar")));
//        avatarIcon.click();
//    }
//
//    protected static String generateRandomName(){
//
//        return UUID.randomUUID().toString().replace("-","");
//    }
//
//    protected static void providePassword(String password){
//        WebElement currentPassword = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[name='current_password']")));
//        currentPassword.clear();
//        currentPassword.sendKeys(password);
//    }
//
//    protected static void provideProfileName(String name){
//        WebElement profileName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='name']")));
//        profileName.clear();
//        profileName.sendKeys(name);
//    }
//
//    protected static void clickSaveButton(){
//        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("button.btn-submit")));
//
//    }


    //HOMEWORK 17 BELOW
    //
    //
    //
    //
    //

//    protected void verifySuccessMessageText() {
//        WebElement successNewPlaylist = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//                "//div[contains(text(), 'new playlist17')]")));
//        Assert.assertTrue(successNewPlaylist.isDisplayed());
//    }
//
//    protected void selectSavePlaylist() {
//        WebElement savePlaylistButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//                "//*[@id='songResultsWrapper']//button[@title='Save']")));
//        savePlaylistButton.click();
//    }
//
//    protected void enterNewPlaylistName(String newPlaylistName) {
//        WebElement createPlaylistField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//                "//*[@id='songResultsWrapper']//input[@data-test='new-playlist-name']")));
//        createPlaylistField.click();
//        createPlaylistField.sendKeys(newPlaylistName);
//    }
//
//    protected void clickAddTo() {
//        WebElement addToButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn-add-to']")));
//        addToButton.click();
//    }
//
//    protected void clickFirstSong() {
//        WebElement firstSong = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//                "(//*[@id='songResultsWrapper']//tr[contains(@class,'song-item')])[1]")));
//        firstSong.click();
//    }
//
//    protected void clickViewAll() {
//        WebElement viewAllButton = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[data-test='view-all-songs-btn']")));
//        viewAllButton.click();
//
//    }
//
//    protected void searchSongName(String songName) {
//        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[name='q']")));
//        searchField.click();
//        searchField.sendKeys(songName);
//    }



    //HOMEWORK 18 BELOW
    //
    //
    //
    //
    //

//    protected void verifySongPlaying() {
//        WebElement progressBar = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[class='plyr__progress--played']")));
//        Assert.assertTrue(progressBar.isDisplayed());
//    }
//
//    protected void clickPlay() {
//        WebElement playControl = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("span[class='play']")));
//        playControl.click();
//    }
//
//    protected void clickPlayNext() {
//        WebElement playNextControl = driver.findElement(
//                (By.cssSelector("footer div i.next")));
//        playNextControl.click();
//    }


    //HOMEWORK 19 BELOW
    //
    //
    //
    //
    //
    //

//    protected String  verifyConfirmationText() {
//        WebElement successDeletedPlaylist = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("div.success.show")));
//        return successDeletedPlaylist.getText();
//    }
//
//    protected void removePlaylist() {
//        WebElement deletePlaylistButton = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[class='del btn-delete-playlist']")));
//        deletePlaylistButton.click();
//
//        WebElement confirmDeletePlaylist = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[class='ok']")));
//        confirmDeletePlaylist.click();
//    }
//
//    protected void clickPlaylist() {
//        WebElement playlistToDelete = wait.until(ExpectedConditions.elementToBeClickable
//                (By.cssSelector("[href='#!/playlist/63351']")));
//        playlistToDelete.click();
//
//    }

    //HOMEWORK 21 BELOW
    //
    //
    //
    //
    //
    //
//    protected void verifyPlaylistIsRenamed() {
//        WebElement successRenamed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
//        Assert.assertTrue(successRenamed.isDisplayed());
//
//
//    }
//
//    protected void renameExistingPlaylist(String newName) {
//        WebElement playlistRenameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
//        playlistRenameField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
//        playlistRenameField.sendKeys(newName);
//        playlistRenameField.sendKeys(Keys.ENTER);
//
//    }
//
//    protected void doubleClickPlaylist() {
//        WebElement existingPlaylist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='#!/playlist/63355']")));
//        actions.doubleClick(existingPlaylist).perform();
//    }
}