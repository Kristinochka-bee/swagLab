package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public abstract class Menu {

    private SelenideElement menuBlock = $x("//div[@class='bm-menu']");

    private SelenideElement closeMenuButton = $x("//button[@id='react-burger-cross-btn']");

    private ElementsCollection menuLinks = $$x("//a[@class='bm-item menu-item']");

}
