package edu.rit.swen352.tdd.hard;

import java.util.InputMismatchException;
import java.util.function.BooleanSupplier;

/**
 * A Value Object for American monetary values with fixed integer
 * values for dollars and cents.
 */
record Money(int dollars, int cents) {}

/**
 * An American bank account that permits deposits and withdrawals.
 * The balance must never be negative.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both an initial balance as {@link Money} value</li>
 *       <li>a no-arg ctor that sets the value to zero</li>
 *     </ul>
 *   </li>
 *   <li>getBalance: returns the current balance</li>
 *   <li>isAccountEmpty(): queries whether the balance is zero</li>
 *   <li>deposit(amount): add a {@link Money} amount to the balance</li>
 *   <li>withdraw(amount): subtract a {@link Money} amount from the balance</li>
 * </ul>
 */
public class BankAccount {
    private Money balance;

    public BankAccount(){
        this.balance = new Money(0, 0);
    }

    public BankAccount(Money money){
        if(money.dollars() >= 0 && money.cents() >= 0){
            this.balance = money;
        }else{
            throw new InputMismatchException("ERROR: Cannot enter a negative value");
        }
    }

    public int getDollars() {
        return balance.dollars();
    }

    public int getCents() {
        return balance.cents();
    }

    public String getBalance() {
        if(getCents() < 10){
            return "$" + getDollars() + ".0" + getCents();
        }
        return "$" + getDollars() + "." + getCents(); 
    }

    public Boolean isAccountEmpty() {
        if(this.getBalance().equals("$0.00")){
            return true;
        }else{
            return false;
        }
    }

    public void deposit(Money money) {
        int updatedDollars = getDollars() + money.dollars();
        int updatedCents = getCents() + money.cents();

        updatedDollars += Math.floor(updatedCents / 100);
        updatedCents = updatedCents % 100;
        
        this.balance = new Money(updatedDollars, updatedCents);
    }

    public void withdraw(Money money) {
        int updatedDollars = getDollars() - money.dollars();
        int updatedCents = getCents() - money.cents();

        if (updatedCents < 0) {
            updatedDollars -= 1;
            updatedCents += 100;
        }

        updatedDollars = Math.max(0, updatedDollars);
        
        balance = new Money(updatedDollars, updatedCents);
    }

}
