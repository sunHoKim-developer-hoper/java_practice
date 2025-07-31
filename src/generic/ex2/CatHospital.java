package generic.ex2;

import generic.animal.Cat;

public class CatHospital {
    
    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){
        return this.animal.getSize() > target.getSize() ? this.animal : target;
    }
}
