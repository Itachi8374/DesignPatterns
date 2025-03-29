package Modules.strategy;


/*
* Duck simulator program
* Different type of ducks
* Optional behaviour - fly, quack
*
* */
public class DuckSimU {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck("malala");
        System.out.println(mallard.fly());
        System.out.println(mallard.swim());
    }
}