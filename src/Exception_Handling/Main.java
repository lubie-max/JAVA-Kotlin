package Exception_Handling;

import java.security.spec.ECField;

public class Main {

    public static void main(String[] args) {


        Exception1 e = new Exception1(0);
        Exception1 f = new Exception1(4);

        e.getSquere();

        try{
           if (e.num != 0){
               System.out.println("this is an inapproprite error.");
           }
        }
        catch (Exception ae){
            System.out.println(ae.getCause());
        }
    }
}
