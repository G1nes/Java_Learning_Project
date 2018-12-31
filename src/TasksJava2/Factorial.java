package TasksJava2;

public class Factorial {
    public int factorial (Object a){
        int d = Math.round((int)a);
        if (d==0){
            d=1;
        }else if (d<0){
            d = factorial (d+1)*d;
        }else {
            d = factorial(d-1)*d;
        }

        return d;
    }
    public void printFactorial (int d){
        System.out.println(d);
    }
}
