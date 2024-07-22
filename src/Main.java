import java.lang.classfile.Interfaces;

public class Main {


    public static void main(String[] args) {
//        Intro i = new Intro("Lubna");
//        System.out.println(i);
//        String n = i.name;
//        System.out.println(n);
//


        //================ upcasting ==============

        Animal d = new  Dog ();
        d.eat();  // overridden
        d.drink();
//        d.sniff(); // we can not access sniff() method from dog since object is created with reference of Parent class


        ///  =================== downcasting ==============


//        Dog d1 = (Dog) new Animal() ; // we will get castExeption ;; and it's not allowed




//        Interfaces ::::




    }

}
