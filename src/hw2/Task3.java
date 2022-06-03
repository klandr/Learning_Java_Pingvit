package hw2;

//+- идея реализации хороша
public class Task3 {
    public static void main(String[] args) {
        //Комментарии нужны для уточнения, что происходит в коде
        int a = 0;
        for (int i = 1; i <= 256; i = i + i) {
            a = a + i; //тут можно использовать а+=i;
        }
        System.out.println("sum=" + a);
    }
}
