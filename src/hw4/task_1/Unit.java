package hw4.task_1;

public class Unit {
    String name;
    int age;

    public String Show(){
        return this.name + " " + this.age;
    }

    Unit(String name, int age){
    this.name = name;
    this.age = age;
    }
}
