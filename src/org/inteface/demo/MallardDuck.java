package org.inteface.demo;

import org.inteface.demo.FlyBehavior.Chick;
import org.inteface.demo.MoveBehavior.Walk;
import org.inteface.demo.SwimBehavior.CanSwim;

public class MallardDuck extends Bird {

    public MallardDuck() {
        iFlyBehavior = new Chick();
        iMoveBehavior = new Walk();
        iSwimBehavior = new CanSwim();

    }

    public void sing() {
        System.out.println("quack - quack");
    }
}
