package hw6.task_2;

public class Engine {
    private String stopEngine;
    private String startEngine;

//    public Engine(String stopEngine, String startEngine) {
//    this.stopEngine = stopEngine;
//    this.startEngine = startEngine;
//    }

    public String getStopEngine(){                      //|get  |
        return stopEngine;                              //|     |
    }                                                   //|     |
                                                        //|     |     Stop engine
    public void setStopEngine(String stopEngine){       //|set  |
        this.stopEngine = stopEngine;                   //|     |
    }                                                   //|     |

    public String getStartEngine(){                    //|get  |
        return startEngine;                             //|     |
    }                                                   //|     |
                                                        //|     |   Start engine
    public void setStartEngine (String startEngine){    //|set  |
        this.startEngine = startEngine;                 //|     |
    }                                                   //|     |
}

