package tests.login;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.login.steps.Steps002;
import tests.login.steps.Steps003;
import utility.RunTestAgain;

public class NegativeLoginTest extends TestBase {
    Steps002 steps002;
    Steps003 steps003;

    @Epic("Login tests")
    @Feature("Negative login test")
    @Test(description = "Authorization with not valid password", retryAnalyzer = RunTestAgain.class)
    @Description("Authorization with not valid password")
    @Link("https://www.tabnine.com/code/java/methods/io.qameta.allure.Allure/link")
    @Link(name = "002 Authorization with not valid password")
    public void authWithWrongPwd002Test() {
        steps002 = new Steps002();
        steps002.step1();
        steps002.step2();
    }

    @Epic("Login tests")
    @Feature("Negative login test")
    @Test(description = "Authorization with not valid login")
    @Description("Authorization with not valid login")
    @Link("https://docs.google.com/document/d/17tn1kNkyNwj_WF3q0J794AiFZxiu44eSThdMqtoDs5g/edit#bookmark=id.nx5jybuism3t")
    public void authWithWrongLogin003Test() {
        steps003 = new Steps003();
        steps003.step1();
        steps003.step2();
    }
}