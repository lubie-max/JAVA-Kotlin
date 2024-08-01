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


    public  void  ParamidPattern(){
        System.out.println("Paramid::");
        for(int i = 0 ; i <num ; i++){

            // spaces
            for(int j = i ; j < num ; j++){
            System.out.print(" ");

            }

            // stars
            for (int k = 1 ; k <= i ; k++){

                System.out.print(" *  ");

            }
        System.out.println("");
        }

    }



    public  void  invertedParamid(){
        System.out.println("Inverted Paramid ::");

        for (int i = 1; i <= num ; i++) {

            for (int j = 1 ; j < i ; j++){
                System.out.print("  ");
            }
            for (int k = num ; k >= i ; k--){
                System.out.print(" *  ");
            }

            System.out.println(" ");


        }
    }


    public  void  HourGlass(){


        System.out.println("Hourglass::");

        for (int i = 1; i <= num; i++) {

            for(int j = 1 ; j <i ; j++){
                System.out.print("  ");
            }
            for(int k = num ; k >= i ; k--){
                System.out.print("*  ");
            }
            System.out.println("");


        }

        for (int i = 1; i <= num; i++) {

            for (int j  = num ; j >=i ; j--){

            System.out.print(" ");
            }

            for (int k =1 ; k <=i ; k++){
                System.out.print(" * ");
            }
            System.out.println("  ");


        }
    }
}
