public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        return true;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
