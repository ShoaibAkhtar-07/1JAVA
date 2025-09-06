class Payment {
    public void pay(){
        System.out.println("Hey,chose the mode of transaction");
    }
}

class UpiPayment extends Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class CardPayment extends Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

public class DynamicMethodDispatch 
{
    public static void main(String[] args) {
        Payment p;
        p = new Payment();
        p.pay();
    
        p = new UpiPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

    }
}
