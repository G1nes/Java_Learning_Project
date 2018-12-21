package Tasks;

import java.util.Scanner;

public class TwelthTask {
    public static void main (String [] argss){
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        String w = s.nextLine();
        String result = q.length()>w.length()? q:w;
        System.out.println(result);
    }
}
