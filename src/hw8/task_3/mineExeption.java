package hw8.task_3;

public class mineExeption extends Exception{
    private String checkNumber;

    public mineExeption(String message, String checkNumber) {
        super(message);
        this.checkNumber = checkNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "mineExeption{'message = '" + this.getMessage()+
                "checkNumber=" + checkNumber +
                '}';
    }
}
