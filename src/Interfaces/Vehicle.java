package Interfaces;

public interface Vehicle {
    int MAX_LIM = 180; //static variable which can only be accessed by Interface name

    // these methods ought to be implemented in the subclasses.
   public   abstract    void accelerate();  // public and abstract are redundant here
                        void maxSpeedLim(int lim);

    //

    public static void   stateOfInterface(){
        System.out.println("interface is running ..");
    }

    public default void   defautInterfaceMethod(){
        System.out.println("default method ..");
    }


}
