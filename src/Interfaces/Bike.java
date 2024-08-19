package Interfaces;



public class Bike extends TwoWheeler  {

    String bikeModel ;
    String bikeName ;



    Bike(String bikeModel , String bikeName){
        this.bikeModel = bikeModel ;
        this.bikeName = bikeName;
    }
    public void getBikeParms(){

        System.out.println("Bike Model :"+ bikeModel  );
        System.out.println("Bike Name :"+ bikeName  );
    }

    @Override
    public void defautInterfaceMethod() {
        super.defautInterfaceMethod();
    }
}
