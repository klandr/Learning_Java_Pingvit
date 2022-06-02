package hw2;

//+
public class Task4 {
    public static void main(String[] args) {

        int a = 10; // chyslo A <- комментарии стараемся писать на английском, но не латинкой
        int b = 8; // chyslo B
        int d = 0; // dodatkowy parametr summa <- может быть отображено в названии переменной result,  например
        
        //Hint: количество итераций может быть оптимизировано, если добавить одну проверку
        for (int i = 1; i <= b; i++) {
            d = d + a;
            //System.out.print(a + " * " + i + " = ");
            //System.out.println(d);
        }
        System.out.println(a + " * " + b + " = " + d);
    }
}
