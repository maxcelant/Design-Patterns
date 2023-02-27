package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.Burger.RegularBurger;
import AbstractFactory.Hotdog.Hotdog;
import AbstractFactory.Hotdog.RegularHotdog;

public class RegularFoodFactory extends AbstractFoodFactory {
    public Burger createBurger(){
        return new RegularBurger();
    }

    public Hotdog createHotdog(){
        return new RegularHotdog();
    }
}
