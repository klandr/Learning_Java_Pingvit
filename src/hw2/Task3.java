package hw2;

public class Task3 {
    public static void main(String[] args) {
        //int i = 1;
        int a = 0 ;
        for (int i = 1;i<=256;i=i+i) {
            //System.out.print(i + " lkjg ");

            a=a+i;
           // System.out.println(a);
        }
        System.out.println("sum=" + a);
    }

}
