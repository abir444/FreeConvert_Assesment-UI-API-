package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //identify webElements
    @FindBy(id = "navbarLoginButton")
    WebElement logIn;
    @FindBy(xpath = "//*[@id=\"navbarAccount\"]/span[1]/span")
    WebElement account;
    @FindBy(name = "email")
    WebElement emailField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(id = "loginButton")
    WebElement loginButtonSubmit;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/app-welcome-banner/div/div[2]/button[2]")
    WebElement welcomePopUp;


    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // action
    public void clickOnAccount() {

        welcomePopUp.click();
        account.click();
        logIn.click();
    }

    public void Login() {
        emailField.sendKeys("abir4.sebpo@gmail.com");
        passwordField.sendKeys("abir4444");
        loginButtonSubmit.click();

    }
}
