package tests.header_footer.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.CatalogPage;
import tests.CommonSteps;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.*;

public class Steps007 extends CommonSteps {
    CatalogPage catalogPage;

    String twitterLink = "https://twitter.com/saucelabs";
    String facebookLink = "https://www.facebook.com/saucelabs";
    String linkedinLink = "https://www.linkedin.com/company/sauce-labs/";
    String linkedInLinkAuth = "https://www.linkedin.com/";

    @Step("Open the catalog page")
    public void step1(){
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
    }


    @Step("Check the Twitter link in the footer")
    public void step2(){
        catalogPage.getSocialLinks().findBy(Condition.exactText("Twitter"))  //находим элемент по тексту
                .shouldHave(Condition.href(twitterLink)).click(); //проверяет , что в атрибуде href этого элемента есть данная ссылка
        switchTo().window(1); //переход- переключиться на вкладку твитер (твитер имеет идекс 1 . т к 0- базовая вкладка магазина)
        webdriver().shouldHave(url(twitterLink)); //проверка по URL, что переключились
        Selenide.closeWindow(); //закроет вкладку
        switchTo().window(0); //возврат на предыдущию страницу магазина с индексом 0
    }

    @Step("Check the Facebook link in the footer")
    public void step3(){
        catalogPage.getSocialLinks().findBy(Condition.exactText("Facebook")) //находим элемент по тексту
                .shouldHave(Condition.href(facebookLink)).click(); //проверяет , что в атрибуде href этого элемента есть данная ссылка
        switchTo().window(1); //переход- переключиться на вкладку твитер (твитер имеет идекс 1 . т к 0- базовая вкладка магазина)
        webdriver().shouldHave(url(facebookLink)); //проверка по URL, что переключились
        Selenide.closeWindow(); //закроет вкладку
        switchTo().window(0); //возврат на предыдущию страницу магазина с индексом 0
    }

    @Step("Check the Linkedin link in the footer")
    public void step4(){
        catalogPage.getSocialLinks().findBy(Condition.exactText("LinkedIn"))  //находим элемент по тексту
                .shouldHave(Condition.href(linkedinLink)).click(); //проверяет , что в атрибуде href этого элемента есть данная ссылка
        switchTo().window(1); //переход- переключиться на вкладку твитер (твитер имеет идекс 1 . т к 0- базовая вкладка магазина)
        //webdriver().shouldHave(urlContaining(linkedInLinkAuth)); //проверка по первой части URL (т к по тесту мы не зарегистрированы на данном сайте), что переключились
        webdriver().shouldHave(urlStartingWith(linkedInLinkAuth));
        //возращаться уже не нужно т к последняя проверка. Дальше закроем браузер
    }


}
