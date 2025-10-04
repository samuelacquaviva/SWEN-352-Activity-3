package edu.rit.swen352.tdd.easy;

public class SimpleBankAccount {
  private float balance;

  SimpleBankAccount() {
    balance = 0;
  }

  float getBalance() {
    return balance;
  }

  boolean isAccountEmpty() {
    return getBalance() == 0;
  }

  void deposit(float amount) {
    balance += amount;
  }

  void withdraw(float amount) {
    float result = Math.round((balance - amount) * 10f) / 10f;
    balance = result;
  }
}
