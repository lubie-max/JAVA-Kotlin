package Inner_Classes;

public class Demo {
    public static void main(String[] args) {

        Inner sk = new Inner();
        sk.getValidAge(22);

        Inner.Voter vt = sk.new Voter();

        System.out.println(vt.applicableCandidate());
    }
}
