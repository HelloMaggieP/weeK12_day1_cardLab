import java.util.ArrayList;

public class OnlineAccount {

    String customerName;
//    ArrayList<IChargable> paymentMethods;
//    ArrayList<>

    public OnlineAccount(String customerName) {
        this.customerName = customerName;
//        this.paymentMethods = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

//    public ArrayList<IChargable> getPaymentMethods() {
//        return paymentMethods;
//    }
}
