package TestRunner;

import Base.Setup;
import Pages.*;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {

    HomePage homePage;
    LoginPage loginPage;
    AddItem addItem;
    AdressForm adress;
    SearchOption Search;


    @Test (priority = 1)
    public void ClickOnLogin()
    {
        driver.get("https://juice-shop.herokuapp.com/#/");
        homePage = new HomePage(driver);
        homePage.clickOnAccount();
    }
    @Test(priority = 2)
    public void Login()
    {
        loginPage = new LoginPage(driver);
        loginPage.Login();
    }

    @Test(priority = 3)
    public void AddToBusket()
    {
        addItem = new AddItem(driver);
        addItem.clickOnAddButton();
        addItem.checkOutButton();
        addItem.addAdressButton();
        //String itemName = addItem.clickOnAddButton();

    }

    @Test(priority = 4)
    public void AdressForm()
    {
        adress = new AdressForm(driver);
        adress.writeAdress();

    }

    @Test(priority = 5)
    public void SearchOption()
    {
        Search = new SearchOption(driver);
        Search.performSearch("Apple");

        // Verify that two apple products are displayed
        System.out.println(Search.countAppleProducts());
        if ( Search.countAppleProducts() == 2) {

            System.out.println("Two apple products found.");
        } else {
            System.out.println("Incorrect number of apple products found.");
        }

        // Verify that no banana product is displayed
        int bananaProductCount = Search.countBananaProducts();
        if (Search.countBananaProducts()== 0) {
            System.out.println("No banana products found.");
        } else {
            System.out.println("Banana product found.");
        }
    }
}
