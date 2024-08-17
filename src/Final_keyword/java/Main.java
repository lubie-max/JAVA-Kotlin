package Final_keyword.java;

public class Main {

    public static void main(String[] args) {

    Areas a = new Areas();
//    a.PI = 2 ; since the variable is final , we can not redeclare it.
    double result = a.getCircleArea(4);
    System.out.println((int)result);

    }

}
