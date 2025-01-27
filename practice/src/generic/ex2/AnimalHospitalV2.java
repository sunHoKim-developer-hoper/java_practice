package generic.ex2;

import generic.animal.Animal;

public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public AnimalHospitalV2(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return this.animal.getSize() > target.getSize() ? this.animal : target;
    }

    public AnimalHospitalV2() {
    }
    
}
