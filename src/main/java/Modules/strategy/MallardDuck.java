package Modules.strategy;

import Modules.strategy.behaviours.FlyBehaviours.FlyWithWings;
import Modules.strategy.behaviours.QuackBehaviours.QuackBehaviour;

public class MallardDuck extends Duck{
    QuackBehaviour quackBehaviour;

    MallardDuck(String name){
        this.name = name;
        flyBehaviour = new FlyWithWings();
    }
}
