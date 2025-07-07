public class Franc extends Money {

    String currency() {
        return ("CHF");
    }

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
