package hw8.task_3;

public class mineExeption extends Exception{
    private int checkNumber;

    public mineExeption(String message, int checkNumber) {
        super(message);
        this.checkNumber = checkNumber;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "mineExeption{'message = '" + this.getMessage()+
                "checkNumber=" + checkNumber +
                '}';
    }
}
