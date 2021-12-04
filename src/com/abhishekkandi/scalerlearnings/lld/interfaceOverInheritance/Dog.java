package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class Dog extends Animal implements Walkable, Audible {

    private WalkingBehaviour _walkingBehaviour;
    private SpeakingBehaviour _speakingBehaviour;

    public Dog(WalkingBehaviour walkingBehaviour,
               SpeakingBehaviour speakingBehaviour){
        _speakingBehaviour = speakingBehaviour;
        _walkingBehaviour = walkingBehaviour;
    }

    @Override
    public void makeSound() {
        _speakingBehaviour.makeSound();
    }

    @Override
    public void walk() {
        _walkingBehaviour.walk();
    }
}
