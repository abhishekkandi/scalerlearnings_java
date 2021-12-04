package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new FastWalkingBehaviour(),
                new SlowSpeakingBehaviour());
        Cat cat = new Cat(new SlowSpeakingBehaviour());
        Monkey monkey = new Monkey(new FastWalkingBehaviour());

        List<Walkable> walkableAnimals = new ArrayList<>();
        walkableAnimals.add(dog);
        walkableAnimals.add(monkey);

        List<Audible> audibleAnimals = new ArrayList<>();
        audibleAnimals.add(dog);
        audibleAnimals.add(cat);

        for (Walkable walkableAnimal : walkableAnimals) {
            walkableAnimal.walk();
        }

        for(Audible audibleAnimal : audibleAnimals){
            audibleAnimal.makeSound();
        }
    }
}
