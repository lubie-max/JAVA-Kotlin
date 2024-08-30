package Inner_Classes;

public class Annonymouse {

    public static void main(String[] args) {

        ShoppingCart ls = new ShoppingCart(200);

        ls.pay(new PaymentMethod() {
            @Override
            public void PaymentType(double ammount) {
                System.out.println("GPay Ammount :" + ammount);
            }
        });


        ls.totalPay(new PaymentMethod() {
            @Override
            public void PaymentType(double ammount) {
                System.out.println("JPayee Amount: " + ammount);
            }
        });
    }
}






