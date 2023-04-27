package tests.product.steps;

import com.codeborne.selenide.Condition;
import enums.Sorting;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.CatalogPage;
import tests.CommonSteps;
import static enums.SortingValue.*;

public class Steps005 extends CommonSteps {
    CatalogPage catalogPage;

    @Step("Login in to the app")
    public void precondition(){
        getLogin();
    }

    @Step("Open the catalog page. Ensure that products are sorted by titles in ascending order")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        Assert.assertTrue(catalogPage.isTitlesSorting(Sorting.ASC));
    }

    @Step("Choose “Name (Z to A)” in the filter. Ensure that products are sorted by titles in descending order")
    public void step2(){  //в дропдауне выбираем нужный фильтр
        catalogPage.getSort().selectOption(NAME_DESC.getValue());
        Assert.assertTrue(catalogPage.isTitlesSorting(Sorting.DESC));
    }

    @Step("Choose “Name (A to Z)” in the filter. Ensure that products are sorted by titles in ascending order")
    public void step3(){
        catalogPage.getSort().selectOption(NAME_ASC.getValue());
        Assert.assertTrue(catalogPage.isTitlesSorting(Sorting.ASC));

    }



}
