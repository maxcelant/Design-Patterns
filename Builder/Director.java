package Builder;

public class Director {
    void buildSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Turbo");
        builder.setModel("Lamborghini");
        builder.setGPS(false);
    }

    void buildSUV(Builder builder) {
        builder.reset();
        builder.setSeats(8);
        builder.setEngine("V6");
        builder.setModel("Hummer");
        builder.setGPS(true);
    }
}
