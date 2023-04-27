package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeMethod
    public void setUp(){
        Configuration.browserCapabilities = new ChromeOptions().addArguments("-remote-allow-origins=*"); //чтоб открывался браузер
        open("https://www.saucedemo.com"); //открывает нужную страничку
    }


    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
