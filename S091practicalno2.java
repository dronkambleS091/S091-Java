package s091practicalno.pkg2;

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made through UPI");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

public class S091practicalno2 {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new CreditCard();
        p2.pay();
    }
}