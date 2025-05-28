package OOP;

import java.math.BigDecimal;

// Binding an object state and behavior together into one unit. 
// We can make class atributes hidden from other classes using encapsulation.

public class Encapsulation {
    public static void main(String[] args) {
        
    }
}

// This is the example of combine properties and bahavoir in one unit.
class Account {
    String name;
    BigDecimal balance;
    boolean hasDreft;

    public BigDecimal withdraw(BigDecimal amount) {

        if(balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;

    }
}

class Shape {
    int length;

    int area(){
        return length * length;
    }
}