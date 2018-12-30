package TasksJava2;

import java.io.IOException;
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
        try{
        Character operator = (Character) array[2];
        switch (operator) {
            case '*':
                double a = (double) array[0] * (double) array[1];
                System.out.println(a);
                break;
            case '/':
                double b = (double) array[0] / (double) array[1];
                System.out.println(b);
                break;
            case '+':
                double c = (double) array[0] + (double) array[1];
                System.out.println(c);
                break;
            case '-':
                double d = (double) array[0] - (double) array[1];
                System.out.println(d);
                break;
        }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    private static Object [] stringToDoubleConverter (String method){
        Object [] array = new Object[3];
        //Убираем пробелы
        method = method.replaceAll("\\s+","");
        try{
            //Определяем знак выражения
            for (int i=0;i<method.length();i++){
                if (method.charAt(i)=='+'||method.charAt(i)=='-'||method.charAt(i)=='*'||method.charAt(i)=='/'){
                    array[2]=method.charAt(i);
                    break;
                }
            }
            //Делим строку на два числа относительно знака
            String [] tmp;
            tmp=method.split("\\+|\\-|\\*|\\/");
            //Заносим числа и знак в массив
            array[0] = Double.valueOf(tmp[0]);
            array[1] = Double.valueOf(tmp[1]);
            //Содержимое массива
            for (int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }catch (NumberFormatException e){
            System.out.println("Please enter numbers");
            command = s.nextLine();
            methodRecognition(stringToDoubleConverter(command));
        }
        return array;
    }
}
