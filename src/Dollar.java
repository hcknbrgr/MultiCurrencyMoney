public class Dollar extends Money {

    private String currency;

    String currency() {
        return currency;
    }

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
