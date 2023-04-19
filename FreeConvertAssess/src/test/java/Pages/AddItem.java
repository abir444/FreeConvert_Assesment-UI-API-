package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItem {

    //identify webElements
    @FindBy(xpath = "(//span[contains(text(),'Add to Basket')])[1]")
    WebElement addToCart;

    @FindBy(xpath = "//span[normalize-space()='Your Basket']")
    WebElement busketButton;

    @FindBy(xpath = "//div[normalize-space()='Apple Juice (1000ml)']")
    WebElement getTextOfItem;

    @FindBy(xpath = "(//button[@id='checkoutButton'])[1]")
    WebElement checkoutButton;

    @FindBy(xpath = "(//span[normalize-space()='Add New Address'])[1]")
    WebElement addAdressButton;



    WebDriver driver;
    public AddItem(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // action
    public void clickOnAddButton() {

        addToCart.click();
        busketButton.click();
//      String itemName = getTextOfItem.getText();
    }

    public void checkOutButton()
    {
        checkoutButton.click();
    }

    public void addAdressButton()
    {
        addAdressButton.click();
    }

}
