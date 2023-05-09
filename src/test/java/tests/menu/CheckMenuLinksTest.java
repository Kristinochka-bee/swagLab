package tests.menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.menu.steps.Steps009;

public class CheckMenuLinksTest extends TestBase {
    Steps009 steps009;

    @BeforeMethod
    public void precondition(){
        steps009 = new Steps009();
        steps009.precondition();
    }

    @Test
    public void checkMenuLinksTest(){
        steps009.step1();
        steps009.step2();
        steps009.step3();
        steps009.step4();
        steps009.step5();
    }
}
