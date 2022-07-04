package com.fasttrack.Exercise2;


class BT extends Banks {
    public BT() {
        super("=============== Welcome to BT bank! ================ ", "BT", 0.0);
    }

    public void withdraw(int amount) {
        int hiddenCommission = 10;
        System.out.println("Wou have chosen to withdraw *** " + amount + "$ *** from your account.");
        System.out.println("Banks commission for this transaction is: " + this.commission + " %");
        if (amount <= this.sold) {
            this.sold = this.sold - amount - ((this.commission / 100) * amount) - hiddenCommission;
        } else {
            System.out.println("Not enough money in your bank account");
        }
        System.out.println("Your sold is :" + this.sold + " $");
    }
}






