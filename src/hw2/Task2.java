package hw2;

//+-
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        //Не забываем форматировать код: for должно быть на уровне int a
        for (int i = 3; i <= 24; i = i + 3) {
            a = a + a;
            System.out.print("за " + i + " години буде ");
            System.out.println(a + " амеб"); //это сообщение может быть частью предыдущего

        }
//Лишние пустые строки - стараемся их всегда убирать


    }
}
