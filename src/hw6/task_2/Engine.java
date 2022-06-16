package hw6.task_2;

public class Engine {
    private String stopEngine;
    private String startEngine;
    public String getStopEngine() {
        System.out.println("print get Stop engine");    //|get  |
        return stopEngine;                              //|     |
    }                                                   //|     |     Stop engine
     public void setStopEngine(String stopEngine) {
        System.out.println("print set Stop engine");    //|set  |
        this.stopEngine = stopEngine;                   //|     |
    }                                                   //|     |
    public String getStartEngine() {
        System.out.println("print get Start engine");   //|get  |
        return startEngine;                             //|     |
    }                                                   //|     |   Start engine
    public void setStartEngine(String startEngine) {
        System.out.println("print set Start engine");   //|set  |
        this.startEngine = startEngine;                 //|     |
    }                                                   //|     |
}

