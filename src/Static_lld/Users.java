package Static_lld;

public class Users {
    int age ;            // instance variables
    String name ;

    static String dept = "it";  // static variable

    static {
       // called once and first
        System.out.println("this is static block");

    }



    public  static void  show(Users obj){
        // only static variable can directly be called , for instance variables we have to pass the object to the static method.
        System.out.println("static method call!!");
        System.out.println(obj.age  +  dept + obj.name );
    }
}
