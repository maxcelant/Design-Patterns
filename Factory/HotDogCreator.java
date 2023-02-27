public class HotDogCreator extends FoodCreator {
    
    @Override
    public Food createFood() {
        return new Hotdog();
    }
}
