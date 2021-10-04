import java.util.ArrayList;

public abstract class PaymentCard {

    String cardName;
    ArrayList<Double> charges;

    public PaymentCard(String cardName) {
        this.cardName = cardName;
        charges = new ArrayList<>();
    }

    public String getCardName() {
        return cardName;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public int getChargesSize() {
        return this.charges.size();
    }
}
