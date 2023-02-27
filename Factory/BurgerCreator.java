public class BurgerCreator extends FoodCreator {
    
    @Override
    public Food createFood() {
        return new Burger();
    }
}
