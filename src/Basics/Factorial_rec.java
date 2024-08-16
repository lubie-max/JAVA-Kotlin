package Basics;

public class Factorial_rec {

    public static void main(String[] args) {

        Factorial_rec f = new Factorial_rec();
        int iF = f.iterFactorial(5);
//        System.out.println(iF);

        int rF = f.recFactorial(5);
        System.out.println(rF);
    }


    public  int iterFactorial(int num){
        int result = 1 ;

        for(int i = 1 ; i <= num ; i++){
            result = result * i ;
        }
        return  result ;
    }

    public int  recFactorial(int num ){
        if (num ==1) {
            return  1 ;
        }

        return  num * recFactorial(num -1);
    }
}
