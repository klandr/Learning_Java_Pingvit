package hw7;

public class task_2 {
    public static void main(String[] args) {
       String someWord = "alucard";
        System.out.println(someWord.length());

        for (int i=someWord.length()-1;i>=0;i--) {
            System.out.print(someWord.charAt(i));
        }
    }
}
