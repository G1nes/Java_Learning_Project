package TasksJava2.CalculatorTasks;

public class Logarithm {
    public void logarithm (Object a, Object b){
        double result = (double) a;
        double foundation = (double) b;
        double log = Math.log(result)/Math.log(foundation);
        System.out.printf("%.4f",log);
    }
}
