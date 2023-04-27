package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.Sorting;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static enums.Sorting.ASC;

@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class=\"shopping_cart_link\"]");

    private SelenideElement catalogTitle = $x("//span[@class=\"title\"]");


    //соберем все элементы заголовки, чтоб потом получить список этих вэб элементов  в cartsTitles
    private ElementsCollection cartsTitles = $$x("//div[@class='inventory_item']//div[@class=\"inventory_item_name\"]");

    private SelenideElement sort = $x("//select[@class=\"product_sort_container\"]"); // 1 доллар - один веб элемент

    //соберем все цены
    private ElementsCollection cardPrices = $$x("//div[@class='inventory_item']//div[@class='inventory_item_price']"); //когда массив вебэлементов , тогда 2 доллара
    public void shouldBeVisible(){
        cartIcon.shouldBe(Condition.visible);
    }

    public boolean isCartIconExist(){
        return cartIcon.isDisplayed();
    }

    public SelenideElement getRandomCard(){
        ElementsCollection cards = $$x("//div[@class='inventory_item']");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());  //генерирует рандомную карточку не больше размера нашего массива
        return cards.get(1);
    }

    public List<String> getTitles(){
        return cartsTitles.texts(); // вытащит текст веб элемента и запишет в  список
    }

    public boolean isTitlesSorting(Sorting sorting){
        List<String> list = getTitles();
        List<String> copy = new ArrayList<>(list); //создаем копию листа*(заголовка) сортируем и сравниваем с оригиналом
        Collections.sort(copy);
        if (sorting == ASC) {  //ASC- ascending order - сортировка в нормальном направлении
            Collections.sort(copy);
        }else if (sorting == Sorting.DESC){
            Collections.sort(copy);
            Collections.reverse(copy);
        }
        return  copy.equals(list);
    }

    //соберем все цены в лист и отрежем доллар валюту
    public List<Double> getPrices(){
        List<String> prices = cardPrices.texts(); //cобрали все цены
        List<String> pr = prices //отсечение первого 0 элемента - т е доллара, сохраняя последующие. Этот метод аналог forEach . Список без доллара
                .stream()
                .map(price -> price.substring(1)) //само действие, будем применять функц программ-е с 1 индекса
                .collect(Collectors.toList()); //записываем в лист

        double[] dbl = pr
                .stream()
                .mapToDouble(value -> Double.parseDouble(value)) //переведем цену в дабл
                .toArray(); //записываем в массив

        List<Double> digPrices = DoubleStream.of(dbl).boxed().collect(Collectors.toList()); // массив dbl перекидываем в лист digPrices уже в формате Double
        return digPrices;

    }

    public boolean isPricesSorting(Sorting sorting){
        List<Double> list = getPrices();
        List<Double> copy = new ArrayList<>(list); //создаем копию листа*(цен) сортируем и сравниваем с оригиналом
        Collections.sort(copy);
        if (sorting == ASC) {  //ASC- ascending order - сортировка в нормальном направлении
            Collections.sort(copy);
        }else if (sorting == Sorting.DESC){
            Collections.sort(copy);
            Collections.reverse(copy);
        }
        return  copy.equals(list);
    }



    /*
    список с текстом заголовков , которое мы получили с помощью метода getTitles
    после применения фильтра (titles)

    Делаем копию списка titles(copy)

    Сортируем список copy

   Проверяем , что в списки titles и copy одинаковые

     */

}
