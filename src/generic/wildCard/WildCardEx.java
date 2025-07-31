package generic.wildCard;

import generic.animal.Animal;

public class WildCardEx {
    
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printGenericV3(Box<T> box){
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
        return t;
    }


    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.getValue());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
    }

    static Animal printWildcardV3(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
