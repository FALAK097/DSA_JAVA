package basics;

public class Abstraction {
    public static void main(String[] args) {

        AUDI a1 = new AUDI();
        a1.start();

        BMW b1 = new BMW();
        b1.start();

    }
}

class BMW extends Car {
    void start() {
        System.out.println("BMW is starting");
    }
}

class AUDI extends Car {
    void start() {
        System.out.println("AUDI is starting");
    }
}

abstract class Car {

    int price;

    abstract void start();
}