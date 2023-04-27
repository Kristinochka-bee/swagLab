package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter

public class Card extends CatalogPage{
    private SelenideElement randCard = getRandomCard();
    private SelenideElement cardTitle = randCard.find("div[class=\"inventory_item_name\"]");
    private SelenideElement cardDesc = randCard.find("div[class = 'inventory_item_desc']");
    private SelenideElement cardPrice = randCard.find("div[class='inventory_item_price']");
    private SelenideElement cardImage = randCard.find("div[class='inventory_item_img']");
    private SelenideElement cardAddCartButton = randCard.find("button[class='btn btn_primary btn_small btn_inventory']");

}
