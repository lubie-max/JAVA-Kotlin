package Interfaces;

import Streams_and_Lambdas.Vahicle;

public class Main {

    public static void main(String[] args) {

        TwoWheeler t1 = new TwoWheeler();

        t1.accelerate();
        t1.maxSpeedLim(30);
        double diff = t1.diffInSpeed();
        System.out.println("diff in speed: " +  diff);

        Vehicle.stateOfInterface(); //static call with interface

        t1.defautInterfaceMethod(); // default interface method , no need of implementing it in subclasses. since can be work with objects directly.

        Bike b1 = new Bike("122lls", "Haunda TVs");
        b1.accelerate();
        b1.getBikeParms();




    }
}
