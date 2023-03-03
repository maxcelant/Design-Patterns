package Builder;

public class CarBuilder implements Builder {

    Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int seats) {
        this.car.seats = seats;
    }

    public void setEngine(String engine) {
        this.car.engine = engine;
    }

    public void setModel(String model) {
        this.car.model = model;
    }

    public void setGPS(boolean hasGPS) {
        this.car.hasGPS = hasGPS;
    }

    public Car getCar() {
        return this.car;
    }
}
