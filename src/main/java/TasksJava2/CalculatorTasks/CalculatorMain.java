package main.java.TasksJava2.CalculatorTasks;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorMain {

    private static String command;
    private static Scanner s;

    public static void main (String [] args) throws IOException{
        s = new Scanner(System.in);
        System.out.println("To show calculator syntax enter \"show me\"\nOR\nWrite command in format: \"a command b\"");
        command = s.nextLine();
        String res = Description.readCommand(command);

        if (isPositive(res)){
            methodRecognition(stringToDoubleConverter(res));
        }else{
            methodRecognition(stringToDoubleConverterNegative(res));
        }
    }
    //Определяет какую операцию, соответствующего смыслу символа, выполнять через вызов и создание объекта класса
    private static void methodRecognition (Object [] array){
        try{
        Character operator = (Character) array[2];
        switch (operator) {
            case '*':
                Multiplication m = new Multiplication();
                m.multiplication(array[0],array[1]);
                break;
            case '/':
                Division d = new Division();
                d.division(array[0],array[1]);
                break;
            case '+':
                Addition a = new Addition();
                a.addition(array[0],array[1]);
                break;
            case '-':
                Subtraction s = new Subtraction();
                s.subtraction(array[0],array[1]);
                break;
            case 's':
                Radix r = new Radix();
                r.radix(array[0],array[1]);
                break;
            case '^':
                Extent e = new Extent();
                e.extent(array[0],array[1]);
                break;
            case '!':
                Factorial f = new Factorial();
                f.printFactorial(f.factorial(array[0]));
                break;
            case 'l':
                Logarithm l = new Logarithm();
                l.logarithm(array[0],array[1]);
                break;
            case '%':
                Percents p = new Percents();
                p.percents(array[0],array[1]);
                break;
        }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //Конвертируем строку в вещественные числа, определяет знак операции и добавляет все в массив. Позволяет работать со строкой, если первый символ был "+"
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
                if (result.charAt(i)=='+'||result.charAt(i)=='-'||result.charAt(i)=='*'||result.charAt(i)=='/'||result.charAt(i)=='%'||result.charAt(i)=='!'||result.charAt(i)=='l'||result.charAt(i)=='s'||result.charAt(i)=='^'){
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
            tmp=result.split("\\+|\\-|\\*|\\/|\\%|\\!|\\^|l|s");
            //Заносим числа и знак в массив
            if (array[2].equals('!')){
                array[0] = (long)Math.floor(Double.valueOf(tmp[0]));
            }else {
                array[0] = Double.valueOf(tmp[0]);
                if (tmp[1].isEmpty() && counterP > 1) {
                    array[1] = Double.valueOf(tmp[2]);
                } else if (tmp[1].isEmpty() && counterN > 1) {
                    array[1] = Double.valueOf(tmp[2]) * -1;
                } else if (tmp[1].isEmpty()) {
                    array[1] = Double.valueOf(tmp[2]);
                } else {
                    array[1] = Double.valueOf(tmp[1]);
                }
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
    //Тотже функционал, что и у предыдущего метода + позволяет работать со строкой если первый символ был "-"
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
                if (result.charAt(i)=='+'||result.charAt(i)=='-'||result.charAt(i)=='*'||result.charAt(i)=='/'||result.charAt(i)=='%'||result.charAt(i)=='!'||result.charAt(i)=='l'||result.charAt(i)=='s'||result.charAt(i)=='^'){
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
            tmp=result.split("\\+|\\-|\\*|\\/|\\%|\\!|\\^|l|s");
            //Заносим числа и знак в массив
            if (array[2].equals('!')){
                array[0] = (long)Math.floor(Double.valueOf(tmp[0]));
            }else {
                array[0] = Double.valueOf(tmp[0]) * -1;
                if (tmp[1].isEmpty() && counterP > 1) {
                    array[1] = Double.valueOf(tmp[2]);
                } else if (tmp[1].isEmpty() && counterN > 1) {
                    array[1] = Double.valueOf(tmp[2]) * -1;
                } else if (tmp[1].isEmpty()) {
                    array[1] = Double.valueOf(tmp[2]);
                } else {
                    array[1] = Double.valueOf(tmp[1]);
                }
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
    //Определяет > 0 или < 0 первое число
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
