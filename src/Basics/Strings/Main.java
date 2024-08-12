package Basics.Strings;

public class Main {

    public  static  void  main(String[] a){
// IN the heap , there is String constant pool ,
// if str contains same/identical content , rather than creating new entry in the heap , the similar memory address get associated to both the variables having same string in it.


        String name = "Lubna";
//        or
        String dob = "122232";

        System.out.println(name.concat(" " +dob));
    }
}
