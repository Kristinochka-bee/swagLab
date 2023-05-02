package tests.header_footer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.header_footer.steps.Steps007;

public class FooterTest extends TestBase {
    Steps007 steps007;

    @BeforeMethod
    public void precondition(){
        steps007 = new Steps007();
        steps007.getLogin();
    }

    @Test
    public void footerSocialLinkTest(){
        steps007.step1();
        steps007.step2();
        steps007.step3();
        steps007.step4();
    }
}
