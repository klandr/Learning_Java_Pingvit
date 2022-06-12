package hw4.task_1;

//+- код не отформатирован 
public class Unit {
    String name; //поля не приватные
    int age;

    //Имя метода должно быть с маленькой буквы 
    public String Show(){
        return this.name + " " + this.age;
    }

    Unit(String name, int age){
    this.name = name;
    this.age = age;
    }

    //Нет геттеров
}
