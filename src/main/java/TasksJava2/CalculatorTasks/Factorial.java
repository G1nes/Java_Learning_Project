package main.java.TasksJava2.CalculatorTasks;

public class Factorial {
    public long factorial (Object a){
        long d = Math.round((long)a);
        if (d==0){
            d=1;
        }else if (d<0){
            d = factorial (d+1)*d;
        }else {
            d = factorial(d-1)*d;
        }

        return d;
    }
    public void printFactorial (long d){

        System.out.println(d);
    }
}
