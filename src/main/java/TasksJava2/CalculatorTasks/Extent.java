package main.java.TasksJava2.CalculatorTasks;

public class Extent {
    public void extent (Object a, Object b){
        double value = (double) a;
        double indicator = (double) b;
        value = Math.pow(value,indicator);
        System.out.printf("%.4f",value);
    }
}
