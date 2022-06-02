package hw2;

/+- идея реализации хороша
public class Task3 {
    public static void main(String[] args) {
        //int i = 1; //не забываем чистить рабочие комментарии. Комментарии нужны для уточнения, что происходит в коде 
        int a = 0 ;
        for (int i = 1;i<=256;i=i+i) {
            //System.out.print(i + " lkjg ");

            a=a+i; //тут можно использовать а+=i;
           // System.out.println(a);
        }
        System.out.println("sum=" + a);
    }

}
