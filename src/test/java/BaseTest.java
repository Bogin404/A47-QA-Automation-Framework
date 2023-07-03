import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.UUID;

public class BaseTest {
    public static WebDriver driver = null;
    public static String url = "https://qa.koel.app/";

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
            public void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    protected static void clickSubmit() {
        WebElement submitLogin = driver.findElement(By.cssSelector("button[type='submit']"));
        submitLogin.click();
    }

    protected static void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    protected static void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);

    }

    protected static void openLoginURL() {
        String url = "https://qa.koel.app/";
        driver.get(url);
    }

    protected static void clickAvatarIcon(){
        WebElement avatarIcon = driver.findElement(By.cssSelector("img.avatar"));
        avatarIcon.click();
    }

    protected static String generateRandomName(){
        return UUID.randomUUID().toString().replace("-","");
    }

    protected static void providePassword(String password){
        WebElement currentPassword = driver.findElement(By.cssSelector("[name='current_password']"));
        currentPassword.clear();
        currentPassword.sendKeys(password);
    }

    protected static void provideProfileName(String name){
        WebElement profileName = driver.findElement(By.cssSelector("[name='name']"));
        profileName.clear();
        profileName.sendKeys(name);
    }

    protected static void clickSaveButton(){
        WebElement saveButton = driver.findElement(By.cssSelector("button.btn-submit"));

    }


    //HOMEWORK 17 BELOW
    //
    //
    //
    //
    //

    protected void verifySuccessMessageText() {
        WebElement successNewPlaylist = driver.findElement(By.xpath(
                "//div[contains(text(), 'new playlist17')]"));
        Assert.assertTrue(successNewPlaylist.isDisplayed());
    }

    protected void selectSavePlaylist() {
        WebElement savePlaylistButton = driver.findElement(By.xpath(
                "//*[@id='songResultsWrapper']//button[@title='Save']"));
        savePlaylistButton.click();
    }

    protected void enterNewPlaylistName(String newPlaylistName) {
        WebElement createPlaylistField = driver.findElement(By.xpath(
                "//*[@id='songResultsWrapper']//input[@data-test='new-playlist-name']"));
        createPlaylistField.click();
        createPlaylistField.sendKeys(newPlaylistName);
    }

    protected void clickAddTo() {
        WebElement addToButton = driver.findElement(By.cssSelector("[class='btn-add-to']"));
        addToButton.click();
    }

    protected void clickFirstSong() {
        WebElement firstSong = driver.findElement(By.xpath(
                "(//*[@id='songResultsWrapper']//tr[contains(@class,'song-item')])[1]"));
        firstSong.click();
    }

    protected void clickViewAll() {
        WebElement viewAllButton = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
        viewAllButton.click();

    }

    protected void searchSongName(String songName) {
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.click();
        searchField.sendKeys(songName);
    }



    //HOMEWORK 18 BELOW
    //
    //
    //
    //
    //

    protected void verifySongPlaying() {
        WebElement progressBar = driver.findElement(By.cssSelector("[class='plyr__progress--played']"));
        Assert.assertTrue(progressBar.isDisplayed());
    }

    protected void clickPlay() {
        WebElement playControl = driver.findElement(By.cssSelector("span[class='play']"));
        playControl.click();
    }

    protected void clickPlayNext() {
        WebElement playNextControl = driver.findElement(By.cssSelector("[class='next fa fa-step-forward control']"));
        playNextControl.click();
    }
}