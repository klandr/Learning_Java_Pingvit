package hw2;

public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        float z = 0 ;
        for (int i = 1;i<=9;i++){
        z = i % 2;

        //b = a+i;
        if (z == 1) { //yakshcho ne parne to
            a = i;
            System.out.println(a);
            //System.out.println(b);
            //System.out.println(a+b);
            }
                }
        //System.out.println(a+b); summa chysel
    }
}
