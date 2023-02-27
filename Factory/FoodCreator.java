abstract public class FoodCreator {

    public void eatFood() {
        Food f = createFood();
        f.eat();
    }
    
    abstract public Food createFood();
}
