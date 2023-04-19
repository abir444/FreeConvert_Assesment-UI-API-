package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //identify webElements
    @FindBy(name = "email")
    WebElement emailField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(id = "loginButton")
    WebElement loginButtonSubmit;


    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // action
    public void Login() {
        emailField.sendKeys("abir4.sebpo@gmail.com");
        passwordField.sendKeys("abir4444");
        loginButtonSubmit.click();

    }

}
