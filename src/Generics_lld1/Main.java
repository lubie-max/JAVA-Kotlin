package Generics_lld1;
import java.util.ArrayList;
import  java.util.List ;
public class Main {

public  static  void  main (String[] args){

    System.out.println("hi there!!");

    List <String> list1 = new ArrayList<>();
    List list2 = new ArrayList();

    list1.add("Lubna");
//    list1.add(3); //will throw the error
    list2.add('L');
    list2.add(43);
    list2.add("LS");

    System.out.println(list1  + " " + list2);


}
}
