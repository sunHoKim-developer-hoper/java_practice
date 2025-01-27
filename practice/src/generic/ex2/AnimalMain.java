package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain {
    
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);

        animalBox.setValue(cat);
        animalBox.setValue(dog);
    }
}
