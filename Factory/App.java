public class App {

    public FoodCreator foodCreator;

    public void init(String foodType) {
        if (foodType.equals("burger")) {
            foodCreator = new BurgerCreator();
            return;
        } 
        
        if (foodType.equals("hotdog")) {
            foodCreator = new HotDogCreator();
            return;
        }
    }
    public static void main(String[] args){
        App app = new App();
        app.init("hotdog");
        app.foodCreator.eatFood();
    }
}
