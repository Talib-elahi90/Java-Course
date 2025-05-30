package OOP;

import java.math.BigDecimal;
import java.util.Objects;

// Binding an object state and behavior together into one unit. 
// We can make class atributes hidden from other classes using encapsulation.
// We can make class attributes hidden from other classes using encapsulation.

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account("Moosa", BigDecimal.TEN, false);
        System.out.println(account.withdraw(new BigDecimal("9.0")));
        System.out.println(account.getBalance());

        System.out.println(account.withdraw(new BigDecimal("1.0")));
        System.out.println(account.getBalance());

        // This is the issue, it has direct access to the balance
        // Fix this issue, go inside of the Account class and make it private
        // account.balance = new BigDecimal("10000.0");
        // System.out.println(account.balance);
    }
}

// This is the example of combine properties and bahavior in one unit.
class Account {
    private String name;
    private BigDecimal balance;
    private boolean hasDraft;

    public Account(String name, BigDecimal balance, boolean hasDreft) {
        this.name = name;
        this.balance = balance;
        this.hasDraft = hasDreft;
    }

    public BigDecimal withdraw(BigDecimal amount) {

        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;

    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isHasDraft() {
        return hasDraft;
    }

    public void setHasDraft(boolean hasDraft) {
        this.hasDraft = hasDraft;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", balance=" + balance + ", hasDraft=" + hasDraft + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasDraft);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (balance == null) {
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
            return false;
        if (hasDraft != other.hasDraft)
            return false;
        return true;
    }

    
}

// Another example of encapsulation
class Shape {
    int length;

    int area() {
        return length * length;
    }
}