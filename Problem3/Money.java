package Problem3;

public class Money {
    private long dollars;
    private int cents;

    // Constructor with amount
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.dollars = (long) amount;
        this.cents = (int) Math.round((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money other) {
        long totalCents = this.cents + other.cents;
        long totalDollars = this.dollars + other.dollars + totalCents / 100;
        return new Money(totalDollars + (totalCents % 100) / 100.0);
    }

    // Subtract method
    public Money subtract(Money other) {
        double result = this.toDouble() - other.toDouble();
        if (result < 0) {
            throw new IllegalArgumentException("Result cannot be negative.");
        }
        return new Money(result);
    }

    // Compare method
    public int compareTo(Money other) {
        return Double.compare(this.toDouble(), other.toDouble());
    }

    // Equals method
    @Override
    public boolean equals(Object other) {
        if (other instanceof Money) {
            Money otherMoney = (Money) other;
            return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
        }
        return false;
    }

    // To double (helper method)
    private double toDouble() {
        return this.dollars + this.cents / 100.0;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    public long getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }
}
