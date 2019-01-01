package Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        char [] array = q.toCharArray();
        String result="";
        for (int i=0;i<array.length;i++){
            if (array[i]==' '){
                i=i+1;
            }
            result+=array[i];
        }
        System.out.println(result);
    }
}
