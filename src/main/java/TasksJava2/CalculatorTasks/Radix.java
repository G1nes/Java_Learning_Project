package main.java.TasksJava2.CalculatorTasks;

public class Radix {
    public void radix (Object a, Object b){
        double value = (double) a;
        double indicator = (double) b;
        value = Math.pow(value, 1.0/indicator);
        System.out.printf("%.4f",value);
    }
}
