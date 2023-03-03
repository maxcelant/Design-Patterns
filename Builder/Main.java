package Builder;

public class Main {

    public static void buildCar(String carType) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        if (carType.equals("Sports Car")) {
            director.buildSportsCar(builder);
        } else if (carType.equals("SUV")) {
            director.buildSUV(builder);
        }
        Car car = builder.getCar();
        car.stats();
    }

    public static void main(String[] args) {
        buildCar("Sports Car");
    }
}
