package Basics;

public class StarPattern {

    int num ;
    StarPattern(int num){
        this.num = num ;
    }

    public   void  rightAnglePattern(){

        for(int i = num;  i > 0 ; i--){
            for (int j= i ; j <num ; j++){
            System.out.print("*");
            }

            System.out.println("");
        }
    }


    public  void  getParamidPattern(){
        System.out.println("Paramid::");
        for(int i = 0 ; i <num ; i++){
            for(int j = i ; j < num ; j++){
            System.out.println("*");

            }
        System.out.println("");
        }

    }
}
