package TasksJava2;

public class Extent {
    public void extent (Object a, Object b){
        double value = (double) a;
        double indicator = (double) b;
        value = Math.pow(value,indicator);
        System.out.println(value);
    }
}
