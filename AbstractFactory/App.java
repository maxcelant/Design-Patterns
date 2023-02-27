package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.Hotdog.Hotdog;

public class App {

    AbstractFoodFactory factory;
    Hotdog hotdog;
    Burger burger;

    public void init(String variation){
        if (variation.equals("regular")){
            factory = new RegularFoodFactory();
        } else if (variation.equals("keto")){
            factory = new KetoFoodFactory();
        } else if (variation.equals("vegan")){
            factory = new VeganFoodFactory();
        }
    }

    public void createFood(){
        this.hotdog = factory.createHotdog();
        this.burger = factory.createBurger();
    }

    public void eat(){
        this.hotdog.eatHotdog();
        this.burger.eatBurger();
    }

    public static void main(String[] args) {
        App app = new App();
        app.init("regular");
        app.createFood();
        app.eat();
    }
}
