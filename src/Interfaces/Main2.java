package Interfaces;

public class Main2 {

    public static void main(String[] args) {
    // we can achieve multiple inheritance with interfaces

        Car maruti = new Car();

        maruti.accelerate();
        maruti.maxSpeedLim(120);
        maruti.hasNavigationSystem(false);

        /*
        *  The Differance between abstract class and an Interface
        *  Abstract class has -> i. instance variables ,  ii. a constructor  ,
        *                        iii. and can not achieve multiple Inheritance.
        *
        *  Interface has -> no instance variables , no constructors, and we can achieve multiple inheritance.
        *  Interface is a blueprint for the class.
        *
        * */

    }
}
