package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.LoginPage;

public class LoginTest extends TestBase{
    String login = "standard_user";
    String password = "secret_sauce";

    String expectedText = "Accepted usernames ";

    LoginPage loginPage;
    CatalogPage catalogPage;

    @Test
    public void loginTest(){
        loginPage = new LoginPage();
        loginPage.login(login,password);
        catalogPage = new CatalogPage();
        //catalogPage.shouldBeVisible();
        Assert.assertTrue(catalogPage.isCartIconExist());
    }

    @Test
    public void checkTextInLoginPage(){
        loginPage = new LoginPage();
        loginPage.checkText(expectedText);
    }
}
