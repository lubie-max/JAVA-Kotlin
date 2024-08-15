package OPP_CONCEPTS;

class  A{

    A(){
        System.out.println("default A ");

    }

    A(int a){
        System.out.println("Param A");
    }


}

class  B extends  A {
    B(){
//        super();  // gets internally called , it calls default constructor of parent class.
//        super(3); // calls param constructor of parent class.  -> A(int a)
        this(2);  // calls param constructor of same class -> B(int b)
        System.out.println("default B");
    }

    B(int b){
        System.out.println("param B");
    }
}


public class Super_This_Demo {

    public static void main(String[] args) {

        // each constructor of a class calls default constructor of its parent class internally with super().
        // and if we have to call the constructor of same class we can use this()

        B b1 = new B();



    }
}
