package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.Hotdog.Hotdog;

abstract public class AbstractFoodFactory {
    abstract Burger createBurger();
    abstract Hotdog createHotdog();
}
