package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class SlowWalkingBehaviour implements  WalkingBehaviour {
    @Override
    public void walk() {
        System.out.println("Walk slowly");
    }
}
