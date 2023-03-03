package Prototype;

public class Bird implements Animal {
    private String habitat;
    private String diet;

    public Bird(String habitat, String diet) {
        this.habitat = habitat;
        this.diet = diet;
    }

    public Bird(Bird b) {
        this.habitat = b.habitat;
        this.diet = b.diet;
    }

    public void eat() {
        System.out.println("Bird eats " + this.diet);
    }

    public Bird clone() {
        return new Bird(this);
    }
}
