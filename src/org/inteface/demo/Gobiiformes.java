package org.inteface.demo;

import org.inteface.demo.Habitat.SeaWater;
import org.inteface.demo.MoveBehavior.Jump;
import org.inteface.demo.SwimBehavior.CanSwim;

public class Gobiiformes extends Fish {

    public Gobiiformes() {
        iSwimBehavior = new CanSwim();
        iMoveBehavior = new Jump();
        iHabitat = new SeaWater();
    }

    public void haveGills() {
        System.out.println("Yes! I have gills");
    }
}
