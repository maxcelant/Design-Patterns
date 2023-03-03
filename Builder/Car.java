package Builder;

public class Car {
    public int seats;
    public String engine;
    public String model;
    public boolean hasGPS;

    public void stats() {
        System.out.println(this.model + " with a " + this.engine + " and " + seats + " seats");
    }
}