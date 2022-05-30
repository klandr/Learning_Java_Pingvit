package hw2;

public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        float z = 0;
        for (int i = 1; i <= 11; i++) {
            z = i % 2;
            if (z == 1) { //yakshcho ne parne to dodayemo
                a = i + a;
                System.out.println(i);
            }
        }
        System.out.println(a);  //suma chysel
    }
}
