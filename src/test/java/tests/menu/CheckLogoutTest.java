package tests.menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.menu.steps.Steps010;

public class CheckLogoutTest extends TestBase {
    Steps010 steps010;

    @BeforeMethod
    public void precondition(){
        steps010 = new Steps010();
        steps010.precondition();
    }

    @Test
    public void checkLogoutTest(){
        steps010.step1();
        steps010.step2();
        steps010.step3();
    }
}
