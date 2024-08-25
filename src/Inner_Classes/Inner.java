package Inner_Classes;

public class Inner {

    static  final  int Age = 19 ;
    Boolean validAge ;


    public  void   getValidAge(int a){
        if (a > Age){
            this.validAge = true;

        }
        else {

           this.validAge = false;
        }
    }



    class  Voter{

        boolean applicableCandidate(){
            if (!validAge){
                System.out.println("Voter is not eligible");
            }
            return false;
        }
    }
}
