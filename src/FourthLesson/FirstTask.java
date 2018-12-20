package FourthLesson;

import java.util.Scanner;

public class FirstTask {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        enterThreeNumbers(x,y,z);
        System.out.println(average(enterThreeNumbers(x,y,z)));
        String q = division(average(enterThreeNumbers(x,y,z)))>3? "Программа выполнена корректно":"Программа выполнена не корректно";
        System.out.println(q);
    }
    public static int[] enterThreeNumbers (int a,int b,int c){
        int [] array = {a,b,c};
        return array;
    }
    public static int average (int [] someArray){
        int result=0;
        for (int i=0;i<someArray.length;i++){
            result += someArray[i];
        }
        return result=result/someArray.length;
    }
    public static int division (int someResult){
        int result = someResult/2;
        return result;
    }
}
