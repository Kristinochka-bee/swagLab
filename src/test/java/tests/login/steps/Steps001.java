package tests.login.steps;


import com.codeborne.selenide.SelenideElement;
import tests.CommonSteps;

import static com.codeborne.selenide.Selenide.$x;

public class Steps001 extends CommonSteps {
    private SelenideElement loginInput = $x("//input[@id=\"user-name\"]");
    private SelenideElement passwordInput = $x("//input[@id=\"password\"]");
    private SelenideElement loginButton = $x("//input[@id=\"login-button\"]");
    private SelenideElement loginPageText = $x("//div[@id=\"login_credentials\"]//h4");


    public void login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public void step1() {
    }
}