package Modules.strategy;

import Modules.strategy.behaviours.FlyBehaviours.FlyBehaviour;

public abstract class Duck {
    public String name;
    public FlyBehaviour flyBehaviour;
    public String swim(){
        return "I am swimming";
    };

    public String fly(){
        return flyBehaviour.fly();
    };
}
