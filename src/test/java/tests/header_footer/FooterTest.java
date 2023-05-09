package tests.header_footer;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.header_footer.steps.Steps007;
import utility.RunTestAgain;

public class FooterTest extends TestBase {
    Steps007 steps007;

    @BeforeMethod
    public void precondition(){
        steps007 = new Steps007();
        steps007.getLogin();
    }

    @Epic("")
    @Feature("Catalog page")
    @Story("Sorting of product")
    @Test (description = "Check social media links", retryAnalyzer = RunTestAgain.class)
    public void footerSocialLinkTest(){
        steps007.step1();
        steps007.step2();
        steps007.step3();
        steps007.step4();
    }
}
