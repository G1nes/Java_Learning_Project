package TasksJava2.CalculatorTasks;

public class Division {

    public void division (Object a,Object b){
        double ab = (double) a;
        double bc = (double) b;
        double result = ab/bc;
        System.out.printf("%.4f",result);
    }
    public double division1 (Object a,Object b) {
        double ab = (double) a;
        double bc = (double) b;
        double result = ab / bc;
        return result;
    }
}
