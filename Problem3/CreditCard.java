package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor with Person and Money
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0); // balance to zero
    }

    // Accessor methods
    public Money getBalance() {
        return new Money(this.balance); // Return a copy
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit); // Return a copy
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit.");
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return owner + ", Credit Limit: " + creditLimit + ", Balance: " + balance;
    }
}
