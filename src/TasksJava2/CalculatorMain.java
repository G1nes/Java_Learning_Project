package TasksJava2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please, write command in format: \"a command b\"");
        String command = s.nextLine();
        methodRecognition(command);
    }
    public static void methodRecognition (String method){
        if (method.contains("+")){

        }if (method.contains("-")){

        }if (method.contains("*")){

        }if (method.contains("/")){

        }
    }
}
