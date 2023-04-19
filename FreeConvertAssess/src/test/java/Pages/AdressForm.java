package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AdressForm {

    //identify webElements
    @FindBy(xpath = "//input[@id='mat-input-3']")
    WebElement countryField;

    @FindBy(xpath = "(//input[@id='mat-input-4'])[1]")
    WebElement nameField;

    @FindBy(xpath = "(//input[@id='mat-input-5'])[1]")
    WebElement mobileNumber;

    @FindBy(xpath = "(//input[@id='mat-input-6'])[1]")
    WebElement zipcodeField;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement addressField;

    @FindBy(xpath = "(//input[@id='mat-input-8'])[1]")
    WebElement cityField;

    @FindBy(xpath = "(//input[@id='mat-input-9'])[1]")
    WebElement stateField;

    @FindBy(xpath = "//button[@id='submitButton']")
    WebElement adressFormSubmitButton;



    WebDriver driver;
    public AdressForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // action
    public void writeAdress()
    {
        countryField.sendKeys("USA");
        nameField.sendKeys("Muntasir");
        mobileNumber.sendKeys("01714397088");
        zipcodeField.sendKeys("1206");
        addressField.sendKeys("KFC florida");
        cityField.sendKeys("florida");
        stateField.sendKeys("florida");
        adressFormSubmitButton.sendKeys(Keys.RETURN);

    }

}
