package org.inteface.demo.SwimBehavior;

public class NoSwim implements ISwimBehavior {

    @Override
    public void swim() {
        System.out.println("I am scared water! I don't swim!");
    }
}
