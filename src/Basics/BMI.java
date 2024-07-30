package Basics;

public class BMI {
    double weight ;
    double height  ;
    BMI(double w , double h){
        this.weight = w ;
        this.height = h;
    }

    public double getBMI(){

        return  Math.ceil( this.weight / (this.height * this.height) );
    }
}
