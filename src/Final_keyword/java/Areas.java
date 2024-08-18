package Final_keyword.java;

public  class Areas {

    public  final double  PI = 3.1456 ;

    public final   double getCircleArea (double r){
       return  PI * r *r ;

    }

}

//class  Param extends  Areas {
    // this Area class can not be extended since the final keyword is assigned to it.
//}

class  Circle extends  Areas{

//    public double  getCircleArea(double r){
//       // will throw the error since the method is final so it can not be overridden.
//    }
}
