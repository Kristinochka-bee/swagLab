package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class=\"shopping_cart_link\"]");

    public void shouldBeVisible(){
        cartIcon.shouldBe(Condition.visible);
    }

    public boolean isCartIconExist(){
        return cartIcon.isDisplayed();
    }
}
