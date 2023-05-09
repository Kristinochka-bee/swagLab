package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement loginInput = $x("//input[@id='user-name']");
    private SelenideElement passwordInput = $x("//input[@id='password']");
    private SelenideElement loginButton = $x("//input[@id='login-button']");

    private SelenideElement loginPageText = $x("//div[@id=\"login_credentials\"]//h4");

    public void login(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void checkText(String expectedText){
        loginPageText.should(text(expectedText));
    }



}
