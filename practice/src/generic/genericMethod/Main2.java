package generic.genericMethod;

import generic.animal.Cat;
import generic.animal.Dog;

public class Main2 {
    
    public static void main(String[] args) {

        Dog d = new Dog("개", 100);
        Cat c = new Cat("냥", 200);

        Dog a = new Dog("강", 2000);
        AnimalMethod.checkup(d);
        Dog dog = AnimalMethod.bigger(d, a);
        AnimalMethod.checkup(dog);
    }   
}
