package Basics;

import java.util.Scanner;

public class flowBlocks {


    public void getNum (){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Num :");
    int num = sc.nextInt();

    sc.close();

        System.out.println(num%2==0?num:"not an even numbs");

    }

}
