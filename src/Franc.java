public class Franc extends Money {

    private String currency;

    String currency() {
        return currency;
    }

    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
