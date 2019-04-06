package org.inteface.demo.MoveBehavior;

public class Jump implements IMoveBehavior {

    @Override
    public void movingOnGround() {
        System.out.println("I can't walk! I am just jumping....");
    }
}
