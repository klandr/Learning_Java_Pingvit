package hw2;

//+- код не отформатирован
//Необходимые треугольники не выводятся
//Попробуй через вложенный цикл, где количество звёздочек зависит от номера строки
//Внешний цикл - строки, внутренний - печать звездочек
public class Task9 {
    public static void main(String[] args) {
        char a = '*';
       System.out.println(a);
        for (int i =1;i<=2;i++)
            System.out.print(a);

        for (int u = 1; u<=3; u++)
            System.out.println(a);
//Не забываем чистить код от рабочих заметок
            /*    for (int y = 1; y<=2; y++)
                    System.out.print(a);
*/
            //System.out.println(a);

    }
}
