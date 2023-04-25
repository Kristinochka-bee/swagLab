package tests.product.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.CatalogPage;
import tests.CommonSteps;

import java.util.List;

public class Steps005 extends CommonSteps {
    CatalogPage catalogPage;
    List<String>  titleAsc;
    List<String> titlesDesc;

    @Step("Login in to the app")
    public void precondition(){
        getLogin();
    }

    @Step("Open the catalog page. Ensure that products are sorted by titles in ascending order")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        titleAsc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSorting(titleAsc, "ASC"));
    }

    @Step("Choose “Name (Z to A)” in the filter. Ensure that products are sorted by titles in descending order")
    public void step2(){  //в дропдауне выбираем нужный фильтр
        catalogPage.getSort().selectOption("Name (Z to A)");
        titlesDesc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSorting(titlesDesc, "DESC"));
    }

    @Step("")
    public void step3(){

    }
}
