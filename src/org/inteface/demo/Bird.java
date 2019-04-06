package org.inteface.demo;

import org.inteface.demo.FlyBehavior.IFlyBehavior;
import org.inteface.demo.MoveBehavior.IMoveBehavior;
import org.inteface.demo.SwimBehavior.ISwimBehavior;

public abstract class Bird implements IAnimal {

    IFlyBehavior iFlyBehavior;
    IMoveBehavior iMoveBehavior;
    ISwimBehavior iSwimBehavior;

    public Bird() {
    }

    public abstract void sing();

    @Override
    public void breathe() {
    }

    @Override
    public void eat() {

    }

    public void performFly() {
        iFlyBehavior.fly();
    }

    public void performMove() {
        iMoveBehavior.movingOnGround();
    }

    public void performSwim() {
        iSwimBehavior.swim();
    }

    public void setIFlyBehavior(IFlyBehavior fb) {
        iFlyBehavior = fb;
    }

}
