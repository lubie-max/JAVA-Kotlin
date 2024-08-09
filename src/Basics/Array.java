package Basics;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
    int[][][] Ar =  new int [3][3][3];

    for(int i = 0 ; i < Ar.length ; i++){

        for (int j = 0 ; j < Ar[i].length ; j++){
            for (int k = 0 ; k<Ar[j].length ; k++){
                 Ar[i][j][k] = (int) (Math.random() * 10);

            }
//            Ar[i][j] = (int) (Math.random() * 10);
        }
    }


        System.out.println(Arrays.deepToString(Ar));
//        System.out.println(Ar);

    }
}
