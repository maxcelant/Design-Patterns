
package Prototype;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Sheep sheep = new Sheep("Farm", "Grass");
        Sheep s2 = sheep.clone(); // Just made a duplicate of the sheep!

        Bird bird = new Bird("Forest", "Seeds");
        Bird b2 = bird.clone(); // Just made a duplicate of the bird!

        // Add the duplicates to the array without affecting the originals
        animals.add(s2);
        animals.add(b2);

        for (Animal animal : animals) { // Polymorphism
            animal.eat();
        }
    }
}
