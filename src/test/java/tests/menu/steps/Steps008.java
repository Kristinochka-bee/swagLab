package tests.menu.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.CatalogPage;
import tests.CommonSteps;

public class Steps008 extends CommonSteps {
    CatalogPage catalogPage;

    @Step("Login in to the app")
    public void precondition(){
        getLogin();
    }

    @Step("Open the catalog page")
    public void step1(){
        catalogPage= new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
    }

    @Step("Click to menu icon")
    public void step2(){
        catalogPage.getBurgerButton().click();
        catalogPage.getMenuBlock().shouldBe(Condition.visible);
    }

    @Step("Click to close menu icon")
    public void step3(){
        catalogPage.getCloseMenuButton().click();
        catalogPage.getMenuBlock().shouldNotBe(Condition.visible);
    }

}
