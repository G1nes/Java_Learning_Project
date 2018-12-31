package TasksJava2.TheLongestString;

import java.util.Scanner;

public class LongestStringFinder {

    private static Scanner s;
    private static int arrayLength;

    public static void main (String [] args){
        s = new Scanner(System.in);
        System.out.println("Please enter array length");
        arrayLength = s.nextInt();
        System.out.println("Please enter some");
        longestStringFinder(initializeArray());
    }
    private static String [] initializeArray(){
        String [] array = new String[arrayLength];
        s = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i] = s.nextLine();
        }
        return array;
    }
    private static void longestStringFinder (String [] someArray){
        int index=0;
        int firstElementLength=someArray[0].length();
        for (int i=1;i<someArray.length;i++){
            if (firstElementLength<someArray[i].length()){
                firstElementLength=someArray[i].length();
                index=i;
            }
        }
        System.out.println(someArray[index]);
    }
}
