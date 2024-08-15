package OPP_CONCEPTS;

class  Mobile{
    private  int privateUnicNo ;
    private  String model ;

    public int getPrivateUnicNo() {
        return privateUnicNo;
    }

    public void setPrivateUnicNo(int privateUnicNo) {

        // 'this' keyword refers to the current Object Instance.
        this.privateUnicNo = privateUnicNo;
    }
}

public class Encapsulation {
    /*
    *  Why we encapsulate the code?
    *  In the real world we do not directly reveal our personal details to any random/unknown people.
    *  If someone wants to do so, they have to justify the things.
    *  when it comes to the code, maintaining safety by not providing direct access to the variable
    *  and encapsulating them with getter and setter makes code safe.
    * */

    public static void main(String[] args) {

        Mobile m = new Mobile();
//        m.model = "ss001";
        m.setPrivateUnicNo(13008);


        System.out.println("Model :" + m.getPrivateUnicNo());

    }
}
