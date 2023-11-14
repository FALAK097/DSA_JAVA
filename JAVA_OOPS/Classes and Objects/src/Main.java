/*Classes and Objects
Objects Behavior*/
public class Main{
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
    }

}

class Person {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk(){
        System.out.println(name + " is walking");
    }
}