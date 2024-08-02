package Exception_Handling;

public class Exception1 {

    int num;

    Exception1(int num){
        this.num = num;
    }

    public  void getSquere() throws  ArithmeticException{
        try {
//            if (num == 0){
//                throw new ArithmeticException("given value is zero");
//            }

            System.out.println("The squere ::" + num *num / num);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
