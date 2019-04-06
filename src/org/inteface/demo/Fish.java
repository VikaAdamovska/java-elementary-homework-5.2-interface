package org.inteface.demo;

import org.inteface.demo.Habitat.IHabitat;
import org.inteface.demo.MoveBehavior.IMoveBehavior;
import org.inteface.demo.SwimBehavior.ISwimBehavior;

public abstract class Fish implements IAnimal {

    ISwimBehavior iSwimBehavior;
    IMoveBehavior iMoveBehavior;
    IHabitat iHabitat;

    public Fish() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void breathe() {

    }

    public abstract void haveGills();

    public void performSwim() {
        iSwimBehavior.swim();
    }

    public void performMove() {
        iMoveBehavior.movingOnGround();
    }

    public void performHabitat() {
        iHabitat.habitat();
    }

    public void setIHabitat(IHabitat hab) {
        iHabitat = hab;
    }
}
