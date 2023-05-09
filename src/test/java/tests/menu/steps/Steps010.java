package tests.menu.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.CatalogPage;
import pages.LoginPage;
import pages.Menu;
import tests.CommonSteps;

public class Steps010 extends CommonSteps {
    CatalogPage catalogPage;
    LoginPage loginPage;


    @Step("Open URL https://www.saucedemo.com/ Log in to the app")
    public void precondition(){
        loginPage = new LoginPage();
        getLogin();
    }

    @Step("Open the catalog page")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
    }

    @Step("Click to menu icon")
    public void step2(){
        catalogPage.getBurgerButton().click();
    }

    @Step("Click to  “Logout” menu link")
    public void step3(){
        catalogPage.getMenuLinks().findBy(Condition.exactText("Logout"))
                .shouldHave(Condition.href("#")).click();
        loginPage.getLoginButton().shouldBe(Condition.visible);
    }

}
