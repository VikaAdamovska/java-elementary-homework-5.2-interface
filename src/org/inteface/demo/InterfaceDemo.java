package org.inteface.demo;
import org.inteface.demo.FlyBehavior.FlyBadly;
import org.inteface.demo.Habitat.FreshWater;

public class InterfaceDemo{
    public static void main(String args[]) {
        /*2)Создать интерфейсы IAnimal, Swimmable, Flyable, IBird, Fish, придумать в них тестовые методы,
            создать несколько классов которые имплементируют имплементируют эти интерффейсы*/

        Bird mallardChick = new MallardDuck();
        mallardChick.performFly();
        mallardChick.performMove();
        mallardChick.performSwim();
        mallardChick.sing();
        mallardChick.setIFlyBehavior(new FlyBadly());
        mallardChick.performFly();

        Fish periophthalmus = new Gobiiformes();
        periophthalmus.performSwim();
        periophthalmus.performMove();
        periophthalmus.performHabitat();
        periophthalmus.haveGills();
        periophthalmus.setIHabitat(new FreshWater());
        periophthalmus.performHabitat();



    }
}