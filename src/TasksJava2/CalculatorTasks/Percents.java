package TasksJava2.CalculatorTasks;

public class Percents {
    public void percents (Object a, Object b){
        double ab = (double) a;
        double bc = (double) b;
        double percents = ab/100*bc;
        System.out.printf("%.4f",percents );
    }
}
