package tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$x;

public class CommonSteps {

    protected Faker faker = new Faker();

    LoginPage loginPage;
    String login = "standard_user";
    String password = "secret_sauce";

    public void getLogin(){
        loginPage = new LoginPage();
        loginPage.login(login,password);
    }

    public void checkErrorText(String text) {
        $x("//div[@class=\"error-message-container error\"]")
                .shouldBe(Condition.exactText(text));
    }



}
