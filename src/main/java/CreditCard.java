public class CreditCard extends PaymentCard implements IChargeable {

    private double limit;
    private double riskMultiplier;

    public CreditCard(String cardName, double limit) {
        super(cardName);
        this.limit = limit;
        this.riskMultiplier = 0.05;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount * (2 * riskMultiplier);
    }

    @Override
    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
        limit -= purchaseAmount;
    }
}
