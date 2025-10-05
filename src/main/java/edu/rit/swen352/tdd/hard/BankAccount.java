package edu.rit.swen352.tdd.hard;

/**
 * A Value Object for American monetary values with fixed integer
 * values for dollars and cents.
 */
record Money(int dollars, int cents) {}

public class BankAccount {
  Money balance;

  BankAccount() {
    balance = new Money(0, 0);
  }

  public int getDollars() {
    return balance.dollars();
  }

  public int getCents() {
    return balance.cents();
  }

  public String getBalance() {
    if (getDollars() == 0 && getCents() == 0)
      return "$0.00";
    return "$" + getDollars() + "." + getCents();
  }

  public boolean isAccountEmpty() {
    if (getDollars() == 0 && getCents() == 0) 
      return true;
    return false;
  }
  
  public void deposit(Money amount) {
    int newDollarAmount = getDollars() + amount.dollars();
    int newCentAmount = getCents() + amount.cents();

    if (newCentAmount > 100) {
      newDollarAmount += 1;
      newCentAmount -= 100;
    }
    
    balance = new Money(newDollarAmount, newCentAmount);
  }

   public void withdraw(Money amount) {
    int newDollarAmount = getDollars() - amount.dollars();
    int newCentAmount = getCents() - amount.cents();

    if (newCentAmount < 0) {
      newDollarAmount -= 1;
      newCentAmount += 100;
    } else if (newDollarAmount < 0) {
      newDollarAmount = 0;
    }
    
    balance = new Money(newDollarAmount, newCentAmount);
  }
}
