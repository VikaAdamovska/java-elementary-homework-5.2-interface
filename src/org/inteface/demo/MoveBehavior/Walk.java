package org.inteface.demo.MoveBehavior;

public class Walk implements IMoveBehavior {

    @Override
    public void movingOnGround() {
        System.out.println("I walk around the earth!");
    }
}
