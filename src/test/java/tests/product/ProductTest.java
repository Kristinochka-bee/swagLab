package tests.product;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.product.steps.Steps004;

public class ProductTest extends TestBase {
    Steps004 steps004;

    @BeforeMethod
    public void precondition(){
        steps004 = new Steps004();
        steps004.precondition();
    }

    @Epic("Product tests")
    @Test(description = "Compare product information on the product card with the information on the product page")
    public void productTest(){
        steps004.step1();
        steps004.step2();
    }
}
