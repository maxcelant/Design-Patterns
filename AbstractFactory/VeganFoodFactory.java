package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.Burger.VeganBurger;
import AbstractFactory.Hotdog.Hotdog;
import AbstractFactory.Hotdog.VeganHotdog;

public class VeganFoodFactory extends AbstractFoodFactory {
    @Override
    public Burger createBurger(){
        return new VeganBurger();
    }
    
    @Override
    public Hotdog createHotdog(){
        return new VeganHotdog();
    }
}
