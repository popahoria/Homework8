package com.fasttrack.Exercise2;

// A person needs a banking account. There are several banks that provide this service: ING, BT, BRD.
// The bank needs to provide the possibility to withdraw and deposit money.


class Banks implements BankingInterface {
    public String welcome;
    private String name;
    public double sold = 0;
    public double commission = 0;

    public Banks(String welcome, String name, double commission) {
        this.welcome = welcome;
        this.name = name;
        this.commission = commission;
    }

    public String getWelcome() {
        return welcome;
    }

    public String getName() {
        return name;
    }

    public double getSold() {
        return sold;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Wou have chosen to withdraw *** " + amount + "$ *** from your account.");
        System.out.println("Banks commission for this transaction is: " + this.commission + " %");
        if (amount <= this.sold) {
            this.sold = this.sold - amount - ((this.commission / 100) * amount);
        } else {
            System.out.println("Not enough money in your bank account");
        }
        System.out.println("Your sold is :" + this.sold);
    }

    @Override
    public void deposit(double amount) {
        sold += amount;
        System.out.println("You successfully deposit " + amount + " $");
    }
}







