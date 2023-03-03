package Builder;

interface Builder {
    void reset();

    void setSeats(int seats);

    void setEngine(String engine);

    void setModel(String model);

    void setGPS(boolean hasGPS);

}