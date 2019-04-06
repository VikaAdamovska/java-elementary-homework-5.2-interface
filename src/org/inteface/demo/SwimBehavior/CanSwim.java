package org.inteface.demo.SwimBehavior;

public class CanSwim implements ISwimBehavior {

    @Override
    public void swim() {
        System.out.println("I swim every day!");
    }
}
