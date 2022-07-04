package com.fasttrack.Exercise2;


public class Main {
    public static void main(String[] args) {
        BT btAccount = new BT();
        System.out.println(btAccount.getWelcome());
        System.out.println("Your sold is: " + btAccount.getSold() + " $");
        btAccount.deposit(1000);
        btAccount.withdraw(100);
        btAccount.getSold();

        ING ING = new ING();
        System.out.println(ING.getWelcome() + ING.getName() + " bank! ===============");
        System.out.println("Your sold is: " + ING.getSold() + " $");
        ING.deposit(3655);
        System.out.println("Your sold is: " + ING.getSold() + " $");
        ING.withdraw(1200);
        ING.getSold();

        BRD BRD = new BRD();
        System.out.println(BRD.getWelcome());
        BRD.deposit(5500.24);
        System.out.println("Your sold is: " + BRD.getSold() + " $");
        BRD.withdraw(1100);
    }
}

