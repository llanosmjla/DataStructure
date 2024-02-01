package usfx.structures.helpclasses;

public class Person {
    public final String name;
    public final int age;

    public Person(){
        this.name = "Default";
        this.age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age;
    }

}
