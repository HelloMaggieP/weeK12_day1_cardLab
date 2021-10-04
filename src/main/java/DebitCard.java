public class DebitCard extends PaymentCard implements IChargeable  {

    private double transactionRate;

    public DebitCard(String cardName) {
        super(cardName);
        this.transactionRate = 0.02;
    }

    public double getTransactionRate() {
        return transactionRate;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount * transactionRate;
    }

    @Override
    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }

}
