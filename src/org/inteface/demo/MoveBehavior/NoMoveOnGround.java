package org.inteface.demo.MoveBehavior;

public class NoMoveOnGround implements IMoveBehavior {

    @Override
    public void movingOnGround() {
        System.out.println("I can't walk and jump on the ground!");
    }
}
