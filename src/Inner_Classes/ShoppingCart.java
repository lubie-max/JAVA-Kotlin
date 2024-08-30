package Inner_Classes;

public class ShoppingCart {

    double totalPay ;

    ShoppingCart(double amount){
        this.totalPay = amount ;
    }

    public void  pay(PaymentMethod pm){
        pm.PaymentType(totalPay);
//        System.out.println("total pay" + totalPay);
    }


    public void totalPay(PaymentMethod paymentMethod) {
        paymentMethod.PaymentType(totalPay);
    }
}

