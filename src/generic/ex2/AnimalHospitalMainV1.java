package generic.ex2;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    
    public static void main(String[] args) {
        
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 50);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();
    }
}
