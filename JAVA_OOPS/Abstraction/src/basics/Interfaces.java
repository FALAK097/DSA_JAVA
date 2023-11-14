package basics;

public class Interfaces implements Car {
    public static void main(String[] args) {

    }

    public void start() {
        System.out.println("Car is starting");
    }
}

interface Car {
    void start();
}