package generic.wildCard;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class Main1 {
    
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        
        dogBox.setValue(new Dog("멍", 1));
        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV1(dogBox);
        Dog d = WildCardEx.printGenericV3(dogBox);

        catBox.setValue(new Cat("야옹", 20));
        Cat cat = WildCardEx.printGenericV3(catBox);
        System.out.println("cat's size : " + cat.getSize());
    }

    static void writeBox(Box<? super Animal> box){
        box.setValue(new Dog("멍" , 100));
    }
}
