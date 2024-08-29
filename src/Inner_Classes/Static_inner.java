package Inner_Classes;

public class Static_inner {


    private static String name = "InnerName";

    private void getName(){
        System.out.println(name);
    }

    public  void setName(String n){
        this.name = n ;
    }



    static class  InnerStat{


        public void  validateName(){
            if (name.contains("I")){
                System.out.println("it's 'I' in there String...");
            }
            else {
                System.out.println("String does not contain I latter.");
            }
        }
    }
}
