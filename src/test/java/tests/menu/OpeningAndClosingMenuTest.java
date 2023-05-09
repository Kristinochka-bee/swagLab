package tests.menu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.menu.steps.Steps008;

public class OpeningAndClosingMenuTest extends TestBase {
    Steps008 steps008;

    @BeforeMethod
    public void precondition(){
        steps008 = new Steps008();
        steps008.precondition();
    }


    @Test
    public void openingAndClosingMenuTest(){
        steps008.step1();
        steps008.step2();
        steps008.step3();
    }
}
