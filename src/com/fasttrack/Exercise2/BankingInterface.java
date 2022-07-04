package com.fasttrack.Exercise2;

public interface BankingInterface {
    String getWelcome();

    String getName();

    double getSold();

    double getCommission();

    void withdraw(int amount);

    void deposit(double amount);
}
