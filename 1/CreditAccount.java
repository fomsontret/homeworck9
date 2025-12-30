public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long creditLimit) {
        super(0);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount < 0) {
            return false;
        }
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount < 0) {
            return false;
        }

        if (balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public long getCreditLimit() {
        return creditLimit;
    }
}