package Interfaces;

public class TwoWheeler implements Vehicle {
    int lim ;
    @Override
    public void accelerate() {
        System.out.println("2 wheeler is accelerating !!");
    }

    @Override
    public void maxSpeedLim(int lim) {
        this.lim = lim;
        System.out.println("it's max speed is: " + lim);
    }

    public double diffInSpeed(){
        return  Vehicle.MAX_LIM - lim ;
    }
}
