package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver givenDriver){
        super(givenDriver);
    }
    @FindBy(css = "input[type='email']")
    WebElement emailField;
    @FindBy(css = "input[type='password']")
    WebElement passwordField;
    @FindBy(css = "button[type='submit']")
    WebElement submitButton;
//    By emailField = By.cssSelector("input[type='email']");
//    By passwordField = By.cssSelector("input[type='password']");
//    By submitButton = By.cssSelector("button[type='submit']");

    public LoginPage provideEmail(String email){
        emailField.sendKeys(email);
        return this;
    }
    public LoginPage providePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickSubmit(){
        submitButton.click();
        return this;
    }

    public LoginPage login(){
        provideEmail("popapipa@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();
        return this;
    }
}
