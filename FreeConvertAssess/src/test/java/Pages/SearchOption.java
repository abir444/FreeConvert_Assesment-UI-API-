package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SearchOption {

    //identify webElements
    @FindBy(xpath = "//mat-icon[normalize-space()='search']")
    WebElement searchButton;

    @FindBy(xpath = "(//input[@id='mat-input-0'])[1]")
    WebElement searchInputText;


//    @FindBy(xpath = "//mat-grid-list[@class='mat-grid-list']")
//    WebElement searchResult1;


//    @FindBy(xpath = "//div[normalize-space()='Apple Pomace']")
//    WebElement searchResult2;

    @FindBy(className = "item-name")
    WebElement searchCard;





    WebDriver driver;
    public SearchOption(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // action
    public void performSearch(String query) {

//        boolean isDisplayed = searchButton.isDisplayed();

        Assert.assertTrue(searchButton.isDisplayed());
        searchInputText.sendKeys(query);
        searchInputText.sendKeys(Keys.RETURN);
//      Assert.assertTrue(driver.getPageSource().contains(search));
//      System.out.println("No banana is found");

    }


    public int countAppleProducts() {

        String searchResultText = searchCard.getText();
        //String searchResultText2 = searchResult2.getText();

        String[] searchResultArray = searchResultText.split("Apple");

        int Card = searchResultArray.length;

        return Card;
    }

    public int countBananaProducts() {

        String searchResultText = searchCard.getText();
        String[] searchResultArray = searchResultText.split("Banana");
        System.out.println(searchResultArray);
        int count = searchResultArray.length - 1;
        return count;
    }
}
