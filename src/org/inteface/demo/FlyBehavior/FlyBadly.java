package org.inteface.demo.FlyBehavior;

public class FlyBadly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I learned to fly, but I fly very badly!");
    }
}
