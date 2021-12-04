package com.abhishekkandi.scalerlearnings.lld.interfaceOverInheritance;

public class Monkey extends Animal implements Walkable {

    private WalkingBehaviour _walkingBehaviour;

    public Monkey(WalkingBehaviour walkingBehaviour){
        _walkingBehaviour = walkingBehaviour;
    }

    @Override
    public void walk() {
        _walkingBehaviour.walk();
    }
}
