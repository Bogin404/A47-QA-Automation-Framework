package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    @FindBy(css = "#userBadge > a.view-profile")
    WebElement avatarIcon;
    @FindBy(css = "[name='current_password']")
    WebElement currentPassword;
    @FindBy(css = "[name='name']")
    WebElement profileName;
    @FindBy(css = "button.btn-submit")
    WebElement saveButton;
    //By avatarIcon = By.cssSelector("#userBadge > a.view-profile");
    //By currentPassword = By.cssSelector("[name='current_password']");
    //By profileName = By.cssSelector("[name='name']");
    //By saveButton = By.cssSelector("button.btn-submit");
    String randomName = generateRandomName();


    public ProfilePage clickAvatarIcon(){
        avatarIcon.click();
        return this;
    }
    public ProfilePage providePassword(String password){
        currentPassword.clear();
        currentPassword.sendKeys(password);
        return this;
    }
    public ProfilePage provideProfileName(){
        profileName.clear();
        profileName.sendKeys(randomName);
        return this;
    }
    public ProfilePage clickSaveButton(){
        saveButton.click();
        return this;
    }

    //Doesn't work
    //
    //By actualProfileName = By.cssSelector("#userBadge > a.view-profile > span");
//    public String returnNewName(){
//        return randomName;
//    }
//    public String assertNewName() {
//        return findElement(actualProfileName).getText();
//    }
}
