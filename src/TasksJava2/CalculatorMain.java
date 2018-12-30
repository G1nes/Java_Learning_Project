package TasksJava2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMain {

    private static String command;

    public static void main (String [] args) throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Please, write command in format: \"a command b\"");
        command = s.nextLine();
        methodRecognition(stringToDoubleConverter(command));
    }
    private static void methodRecognition (Object [] array){
        String operator = (String) array[2];
        switch (operator){
            case "*":
                double a = (double) array [0] * (double) array[1];
                System.out.println(a);
                break;
            case "/":
                double b = (double) array [0] / (double) array[1];
                System.out.println(b);
                break;
            case "+":
                double c = (double) array [0] + (double) array[1];
                System.out.println(c);
                break;
            case "-":
                double d = (double) array [0] - (double) array[1];
                System.out.println(d);
                break;
            /*default:
                System.out.println("Try again, use \"*\", \"/\", \"+\", \"-\" as operator" );
                methodRecognition(stringToDoubleConverter(command));
                break;*/
        }
    }
    private static Object [] stringToDoubleConverter (String method){
        Object [] array = new Object[3];
        try{

        }catch (NumberFormatException e){
            System.out.println("Try again, use \"*\", \"/\", \"+\", \"-\" as operator" );
            methodRecognition(stringToDoubleConverter(command));
        }
        return array;
    }
}
