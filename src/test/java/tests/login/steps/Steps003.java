package tests.login.steps;

import io.qameta.allure.Step;
import pages.LoginPage;
import tests.CommonSteps;

public class Steps003 extends CommonSteps {
    String login = faker.name().username();
    String password = "secret_sauce";
    String expectedErrorText = "Epic sadface: Username and password do not match any user in this service";
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