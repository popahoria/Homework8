package com.fasttrack.Exercise3;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        System.out.println(mouse.walk());
        System.out.println(mouse.eat());
        System.out.println(mouse.talk());

        Cat cat = new Cat();
        System.out.println(cat.walk());
        System.out.println(cat.eat());
        System.out.println(cat.talk());

        Dog dog = new Dog();
        System.out.println(dog.walk());
        System.out.println(dog.eat());
        System.out.println(dog.talk());

        Chicken chicken = new Chicken();
        System.out.println(chicken.walk());
        System.out.println(chicken.eat());
        System.out.println(chicken.talk());
    }
}

