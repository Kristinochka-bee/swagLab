package pages;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;

@Getter
public class BasePage {

    private ElementsCollection socialLinks = $$x("//ul[@class='social']//a"); //общий локатор для 3х элементов (ссылок)



}
