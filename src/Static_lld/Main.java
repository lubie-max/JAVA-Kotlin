package Static_lld;

public class Main {

    public static void main(String[] args) {
    // the variable with the static keyword in the class has same value for all objects

        String a = "xyz";
        String b = "xyz";

//        System.out.println(a +"-" + b +"." + a+b);

        Users u1 = new Users();
        u1.age = 10;
        u1.name = "duggu";
//        dept_id = "002";
        System.out.println(u1.age +  u1.name );
    }
}
