package AbstractKeyword.java;

public class Main {

    public static void main(String[] args) {

        Animal a = new Cat(); // we can do upcasting for ref instance class.
        a.getName();
//        Animal a2 = new Animal(); // but we can't create the object of an abstract class.

    }
}
