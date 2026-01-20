package Opps;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @ Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ObjectToString {
    public static void main(String[] args) {
        Person p = new Person("Sagar", 22);
        System.out.println(p.toString());
    }
}
