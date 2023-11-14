public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Falak";
        p1.age = 20;

        Person p2 = new Person(31, "Faisal"); // Parameterized Constructor check

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.walk();
        p2.eat();

        System.out.println(Person.count); // Static variable
    }
}

class Person {
    String name;
    int age;

    static int count; // Static variable is shared by all objects of the class and is not part of the object itself but the class itself

    public Person() {
        count++;
        System.out.println("Creating an object"); // Default Constructor check
    }

    public Person(int newAge, String newName) {
        this(); // Calling the default constructor from the parameterized constructor
        name = newName; // this.name = newName; // this keyword is used to refer to the current object
        age = newAge; // this.age = newAge; // this keyword is used to refer to the current object
    }

    // Constructor overloading
    public Person(String Name) {
        this(); // Calling the default constructor from the overloaded constructor
        name = Name;
    }

    // Copy Constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk() {
        System.out.println(name + " is walking");
    }
}