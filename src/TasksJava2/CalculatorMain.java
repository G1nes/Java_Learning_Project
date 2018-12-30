package TasksJava2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMain {

    private static String command;
    private static Scanner s;

    public static void main (String [] args) throws IOException{
        s = new Scanner(System.in);
        System.out.println("Please, write command in format: \"a command b\"");
        command = s.nextLine();
        methodRecognition(stringToDoubleConverter(command));
    }
    private static void methodRecognition (Object [] array){
        Character operator = (Character) array[2];
        switch (operator){
            case '*':
                double a = (double) array [0] * (double) array[1];
                System.out.println(a);
                break;
            case '/':
                double b = (double) array [0] / (double) array[1];
                System.out.println(b);
                break;
            case '+':
                double c = (double) array [0] + (double) array[1];
                System.out.println(c);
                break;
            case '-':
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
        //Убираем пробелы
        method = method.replaceAll("\\s+","");
        //Делим строку на два числа относительно знака
        String [] tmp;
        tmp=method.split("\\+|\\-|\\*|\\/");
        try{
        //Заносим числа и знак в массив
        array[0] = Double.valueOf(tmp[0]);
        array[1] = Double.valueOf(tmp[1]);
        char result=0;
        for (int i=0;i<method.length();i++){
            if (method.charAt(i)=='+'||method.charAt(i)=='-'||method.charAt(i)=='*'||method.charAt(i)=='/'){
                array[2]= result;
            }else{
                System.out.println("Try again, use \"*\", \"/\", \"+\", \"-\" as operator");
                command = s.nextLine();
                methodRecognition(stringToDoubleConverter(command));
            }
        }
        }catch (NumberFormatException e){
            System.out.println("Please enter numbers");
            command = s.nextLine();
            methodRecognition(stringToDoubleConverter(command));
        }
        return array;
    }
}
