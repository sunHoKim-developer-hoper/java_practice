package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;

public class AnimalHospitalV1 {

    private Animal animal;

    public AnimalHospitalV1(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return this.animal.getSize() > target.getSize() ? this.animal : target;
    }

    public AnimalHospitalV1() {
    }
    
}
