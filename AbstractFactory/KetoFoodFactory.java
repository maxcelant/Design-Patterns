package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.Burger.KetoBurger;
import AbstractFactory.Hotdog.Hotdog;
import AbstractFactory.Hotdog.KetoHotdog;

public class KetoFoodFactory extends AbstractFoodFactory {
    
    @Override
    public Burger createBurger(){
        return new KetoBurger();
    }

    @Override
    public Hotdog createHotdog(){
        return new KetoHotdog();
    }
}
