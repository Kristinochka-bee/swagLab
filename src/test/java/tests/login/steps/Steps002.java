package tests.login.steps;

import pages.LoginPage;
import tests.CommonSteps;
import io.qameta.allure.Step;
import tests.CommonSteps;

public class Steps002 extends CommonSteps {
    String login = "standard_user";
    String password = faker.internet().password();
    String expectedErrorText = "Epic sadface: Username and password do not match any user in this service jdjdjdjdjd";
    LoginPage loginPage;


    @Step("Log in using not valid password")
    public void step1() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
    }

    @Step("Ensure that the error message is displayed under the input fields")
    public void step2() {
        checkErrorText(expectedErrorText);
    }

}
