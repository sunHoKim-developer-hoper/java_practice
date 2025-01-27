package generic.ex2;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    
    public static void main(String[] args) {
        
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 50);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        System.out.println();

        catHospital.setAnimal(cat);
        catHospital.checkup();
        
        System.out.println();

        Cat biggerCat = catHospital.bigger(new Cat("호양이", 10000));
        System.out.println(biggerCat);
    }
}
