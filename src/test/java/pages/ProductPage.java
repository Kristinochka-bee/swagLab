package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ProductPage extends BasePage{
    private SelenideElement productTitle = $x("//div[@class=\"inventory_details_name large_size\"]");
    private SelenideElement productPrice = $x("//div[@class=\"inventory_details_price\"]");
    private SelenideElement productDescription = $x("//div[@class=\"inventory_details_desc large_size\"]");
    private SelenideElement productAddCartButton = $x("//button[@id='add-to-cart-sauce-labs-backpack']");
    private SelenideElement productImage = $x("//img[@class='inventory_details_img']");
}
