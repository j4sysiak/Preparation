package co.devfoundry;

import co.devfoundry.meal.*;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();

    }

}
