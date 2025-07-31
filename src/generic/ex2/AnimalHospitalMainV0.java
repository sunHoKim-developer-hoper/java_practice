package generic.ex2;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 50);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();
    }
}
