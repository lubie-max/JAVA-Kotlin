package Inner_Classes;

public class Inner {

    private int validMinAge = 19 ;


// This is member inner class.
    class  Voter{

        public void applicableCandidate(int age){
            if ( age < validMinAge){
                System.out.println("Voter is not eligible");
            }
            else {

            System.out.println("u r eligible");
            }
        }
    }
}
