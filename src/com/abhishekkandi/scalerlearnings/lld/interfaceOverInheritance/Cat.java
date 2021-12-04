package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class Cat extends Animal implements Audible {

    private SpeakingBehaviour _speakingBehaviour;//Cat HAS SPEAKING BEHAVIOUR; COMPOSITION

    public Cat(SpeakingBehaviour speakingBehaviour){
        _speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void makeSound() {
        _speakingBehaviour.makeSound();
    }
}
