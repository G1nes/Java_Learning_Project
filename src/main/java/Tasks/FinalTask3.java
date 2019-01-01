package Tasks;

import java.util.Scanner;

public class FinalTask3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double currencyValue = sc.nextDouble();
        double rubles = sc.nextDouble();
        System.out.printf("%.2f",currencyСonverter(currencyValue,rubles));
    }
    public static double currencyСonverter (double currencyValue, double rubles){
        double result=currencyValue*rubles;
        return result;
    }
}
