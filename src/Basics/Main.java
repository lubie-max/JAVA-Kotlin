package Basics;

public class Main {

    public static  void  main(String[] a){
        System.out.println("learning basics:");

        // get age and weight and calculate BMI
        BMI lubna = new BMI(48 , 1.32);

//        System.out.println("Lubna's BMI :" + lubna.getBMI());

        // Star pattern::

        StarPattern s = new StarPattern(5);
//
            s.HourGlass();
            s.ParamidPattern();
            s.invertedParamid();
    }
}
