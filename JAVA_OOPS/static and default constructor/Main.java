public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Falak";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "Kucch Bhi";
        p2.age = 25;

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

    static int count; // Static variable is shared by all the objects of the class and is not a part
                      // of the object itself but the class itself

    public Person() {
        count++;
        System.out.println("Creating an object"); // Default Constructor check
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk() {
        System.out.println(name + " is walking");
    }
}