public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Falak";
        p1.age = 20;

        Developer p2 = new Developer("Faisal"); // Create a Developer object

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        // p1.walk();
        // p1.work(); // Calls the work() method of the Person class

        // p2.eat();
        // p2.work(); // Calls the overridden work() method of the Developer class

        // System.out.println(Person.count); // Static variable
        p2.work();
    }
}

class Developer extends Person { // Inheritance
    public Developer(String name) {
        super(name); // Calls the constructor of the Person class with name as the parameter
    }

    void work() { // run time polymorphism
        System.out.println("Developer " + name + " is coding");
    }
}

class Person {
    String name;
    int age;

    static int count; // Static variable (belongs to the class and not the object)

    public Person() {
        count++; // Incrementing the static variable count
        System.out.println("Creating an object");
    }

    public Person(int newAge, String newName) {
        this(); // Calls the default constructor of the Person class
        name = newName; // Assigning the value of newName to the instance variable name
        age = newAge; // Assigning the value of newAge to the instance variable age
    }

    public Person(String Name) { // Constructor overloading
        this(); // Calls the default constructor of the Person class
        name = Name; // Assigning the value of Name to the instance variable name
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void work() {
        System.out.println(name + " is working");
    }
}
