package TasksJava2;

import TasksJava2.CalculatorTasks.CalculatorMain;
import TasksJava2.TheLongestString.LongestStringFinder;

import java.io.IOException;
import java.util.Scanner;

public class Tst {
    public static void main (String [] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter \"1\" to use Calculator, enter \"2\" to use Longest String Finder");
        int q = s.nextInt();
        if (q==1){
            CalculatorMain.main(args);
        }else if(q==2){
            LongestStringFinder.main(args);
        }else{
            System.out.println("You have entered the wrong number, try again");
            Tst.main(args);
        }

    }
}
