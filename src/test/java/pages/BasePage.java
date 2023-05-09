package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BasePage extends Menu{

    private ElementsCollection socialLinks = $$x("//ul[@class='social']//a"); //общий локатор для 3х элементов (ссылок)

    private SelenideElement burgerButton = $x("//button[@id=\"react-burger-menu-btn\"]");
}
