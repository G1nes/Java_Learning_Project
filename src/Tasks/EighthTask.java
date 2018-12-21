package Tasks;

import java.util.Scanner;

//Некорретное задание, т.к. не определены ограничения.
//Поэтому как ограничение возьму формат ввода = целые числа и 10 операций ввода.

public class EighthTask {
    public static void main (String []args){
        int [] array = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i=0;i<10;i++){
            int q = s.nextInt();
            array[i] = q;
        }
        for (int temp:array){
            System.out.println(temp);
        }
    }
}
