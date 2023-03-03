package Prototype;

public class Sheep implements Animal {

    private String habitat;
    private String diet;

    public Sheep(String habitat, String diet) {
        this.habitat = habitat;
        this.diet = diet;
    }

    public Sheep(Sheep s) {
        this.habitat = s.habitat;
        this.diet = s.diet;
    }

    public void eat() {
        System.out.println("Sheep eats " + this.diet);
    }

    public Sheep clone() {
        return new Sheep(this);
    }
}