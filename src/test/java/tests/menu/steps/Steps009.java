package tests.menu.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.CatalogPage;
import tests.CommonSteps;

public class Steps009 extends CommonSteps {
    CatalogPage catalogPage;


    @Step("Open URL https://www.saucedemo.com/" + "Log in to the app")
    public void precondition(){
        getLogin();
    }

    @Step("Open the catalog page and open the menu")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        catalogPage.getBurgerButton().click();
    }

    @Step("Check “All Items” menu link")
    public void step2(){
        catalogPage.getMenuLinks().findBy(Condition.exactText("All Items"))
                .shouldHave(Condition.href("#"));
    }

    @Step("Check “About” menu link")
    public void step3(){
        catalogPage.getMenuLinks().findBy(Condition.exactText("About"))
                .shouldHave(Condition.href("https://saucelabs.com/"));
    }

    @Step("Check “Logout” menu link")
    public void step4(){
        catalogPage.getMenuLinks().findBy(Condition.exactText("Logout"))
                .shouldHave(Condition.href("#"));
    }

    @Step("Check “Reset App State” menu link")
    public void step5(){
        catalogPage.getMenuLinks().findBy(Condition.exactText("Reset App State"))
                .shouldHave(Condition.href("#"));
    }

}
