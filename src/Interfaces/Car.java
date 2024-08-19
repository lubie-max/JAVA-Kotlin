package Interfaces;

import Streams_and_Lambdas.Vahicle;

public class Car implements  Vehicle , FourWheeler{

    @Override
    public void noOfAirBags(int num) {
        System.out.println("Total Air Bags :" + num);
    }

    @Override
    public boolean hasSunRoof(boolean ans) {
        return ans;
    }

    @Override
    public boolean hasNavigationSystem(boolean ans) {
        return ans;
    }

    @Override
    public void accelerate() {
        System.out.println("car has been accelerating !!");
    }

    @Override
    public void maxSpeedLim(int lim) {
        System.out.println("with speed " + lim);
    }
}
