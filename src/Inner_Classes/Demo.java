package Inner_Classes;

public class Demo {
    public static void main(String[] args) {
        /*
            Inner class can access the default/privet attributes of outer class
         */
        Inner sk = new Inner();
        Inner.Voter vt = sk.new Voter();
        vt.applicableCandidate(24);



        // We use Static Inner classes to save memory from creating unwanted objs
        // The Builder ( Creational ) Design pattern is a great application.

        Static_inner obj = new Static_inner();
        obj.setName("LubnaI");
        Static_inner.InnerStat statObj = new  Static_inner.InnerStat();
        statObj.validateName();









    }
}
