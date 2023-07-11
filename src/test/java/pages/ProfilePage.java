package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.UUID;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By avatarIcon = By.cssSelector("#userBadge > a.view-profile");
    By currentPassword = By.cssSelector("[name='current_password']");
    By profileName = By.cssSelector("[name='name']");
    By saveButton = By.cssSelector("button.btn-submit");
    String randomName = generateRandomName();
    By actualProfileName = By.cssSelector("#userBadge > a.view-profile > span");

    public void clickAvatarIcon(){
        findElement(avatarIcon).click();
    }
    public void providePassword(String password){
        findElement(currentPassword).clear();
        findElement(currentPassword).sendKeys(password);
    }
    public void provideProfileName(){
        findElement(profileName).clear();
        findElement(profileName).sendKeys(randomName);
    }
    public void clickSaveButton(){
        findElement(saveButton).click();
    }

    //Doesn't work
    //
    //
//    public String returnNewName(){
//        return randomName;
//    }
//    public String assertNewName() {
//        return findElement(actualProfileName).getText();
//    }
}
