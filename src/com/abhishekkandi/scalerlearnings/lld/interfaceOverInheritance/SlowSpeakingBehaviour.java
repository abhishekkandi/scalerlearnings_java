package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class SlowSpeakingBehaviour implements SpeakingBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Speaking slowly");
    }
}
