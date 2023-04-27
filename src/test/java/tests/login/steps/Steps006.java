package tests.login.steps;

import com.codeborne.selenide.Condition;
import enums.Sorting;
import io.qameta.allure.Step;
import pages.CatalogPage;
import tests.CommonSteps;
import static enums.SortingValue.*;


public class Steps006 extends CommonSteps {
    CatalogPage catalogPage;

    @Step("Open the catalog page Choose “Price (low to high)” in the filter")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        catalogPage.getSort().selectOption(PRICE_ASC.getValue());
        catalogPage.isPricesSorting(Sorting.ASC);
    }

    @Step("Choose “Price (high to low)” in the filter")
    public void step2(){
        catalogPage.getSort().selectOption(PRICE_DESC.getValue());
        catalogPage.isPricesSorting(Sorting.DESC);
    }
}
