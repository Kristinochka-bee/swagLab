package tests.product.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.Card;
import pages.CatalogPage;
import pages.ProductPage;
import tests.CommonSteps;


public class Steps004 extends CommonSteps {
    Card card;
    ProductPage productPage;
    CatalogPage catalogPage;
    String cardTitle;

    @Step("Login in to the app")
    public void precondition(){
        getLogin();
    }

    @Step("In the product catalog click on the title of the product")
    public void step1(){
        catalogPage= new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        card = new Card();

        cardTitle = card.getCardTitle().text(); //вытягиваем текст заголовка в переменную
        card.getCardTitle().click();
    }

    @Step("Compare info on the page with the info on the card")
    public void step2(){
        productPage = new ProductPage();
        productPage.getProductPrice().shouldBe(Condition.visible);
        productPage.getProductTitle().shouldHave(Condition.text(cardTitle));  //проверяем что там записан такой же текст, который мы записывали в переменную выше

    }

}
