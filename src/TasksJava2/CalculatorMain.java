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
        if (isPositive(command)){
            methodRecognition(stringToDoubleConverter(command));
        }else{
            methodRecognition(stringToDoubleConverterNegative(command));
        }
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
        String result="";
        if (method.charAt(0)=='+') {
            for (int i = 1; i < method.length(); i++) {
                result += method.charAt(i);
            }
        }else{
            result=method;
        }
        try{
            //Определяем знак выражения
            int counterP=0,counterN=0;
            for (int i=0;i<result.length();i++){
                if (result.charAt(i)=='+'||result.charAt(i)=='-'||result.charAt(i)=='*'||result.charAt(i)=='/'){
                    array[2]=result.charAt(i);
                    counterP++;
                    counterN++;
                    for (int y=i+1;y<result.length();y++){
                        if (result.charAt(y)=='+'){
                            counterP++;
                            break;
                        }
                        if (result.charAt(y)=='-'){
                            counterN++;
                            break;
                        }
                    }
                    break;
                }
            }
            //Делим строку на два числа относительно знака
            String [] tmp;
            tmp=result.split("\\+|\\-|\\*|\\/");
            //Заносим числа и знак в массив
            array[0] = Double.valueOf(tmp[0]);
            if (tmp[1].isEmpty()&&counterP>1){
                array[1] = Double.valueOf(tmp[2]);
            }else if(tmp[1].isEmpty()&&counterN>1){
                array[1] = Double.valueOf(tmp[2])*-1;
            }else if(tmp[1].isEmpty()){
                array[1] = Double.valueOf(tmp[2]);
            }else{
                array[1] = Double.valueOf(tmp[1]);
            }
        }catch (NumberFormatException e){
            System.out.println("Please enter numbers");
            command = s.nextLine();
            if (isPositive(command)){
                methodRecognition(stringToDoubleConverter(command));
            }else{
                methodRecognition(stringToDoubleConverterNegative(command));
            }
        }
        return array;
    }
    private static Object [] stringToDoubleConverterNegative (String method){
        Object [] array = new Object[3];
        //Убираем первый минус
        String result="";
        for (int i=1;i<method.length();i++){
            result+=method.charAt(i);
        }
        try{
            //Определяем знак выражения
            int counterP=0,counterN=0;
            for (int i=0;i<result.length();i++){
                if (result.charAt(i)=='+'||result.charAt(i)=='-'||result.charAt(i)=='*'||result.charAt(i)=='/'){
                    array[2]=result.charAt(i);
                    counterP++;
                    counterN++;
                    for (int y=i+1;y<result.length();y++){
                        if (result.charAt(y)=='+'){
                            counterP++;
                            break;
                        }
                        if (result.charAt(y)=='-'){
                            counterN++;
                            break;
                        }
                    }
                    break;
                }
            }
            //Делим строку на два числа относительно знака
            String [] tmp;
            tmp=result.split("\\+|\\-|\\*|\\/");
            //Заносим числа и знак в массив
            array[0] = Double.valueOf(tmp[0])*-1;
            if (tmp[1].isEmpty()&&counterP>1){
                array[1] = Double.valueOf(tmp[2]);
            }else if(tmp[1].isEmpty()&&counterN>1){
                array[1] = Double.valueOf(tmp[2])*-1;
            }else if(tmp[1].isEmpty()){
                array[1] = Double.valueOf(tmp[2]);
            } else{
                array[1] = Double.valueOf(tmp[1]);
            }
        }catch (NumberFormatException e){
            System.out.println("Please enter numbers");
            command = s.nextLine();
            if (isPositive(command)){
                methodRecognition(stringToDoubleConverter(command));
            }else{
                methodRecognition(stringToDoubleConverterNegative(command));
            }
        }
        return array;
    }
    private static boolean isPositive (String method){
        boolean positive;
        method = method.replaceAll("\\s+","");
        if (method.charAt(0)!='-'||method.charAt(0)=='+'){
            positive = true;
        }else{
            positive = false;
        }
        return positive;
    }
}
