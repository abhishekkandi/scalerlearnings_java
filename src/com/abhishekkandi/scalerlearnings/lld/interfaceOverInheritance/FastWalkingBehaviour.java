package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class FastWalkingBehaviour implements WalkingBehaviour {

    @Override
    public void walk() {
        System.out.println("Walk Fast");
    }
}
