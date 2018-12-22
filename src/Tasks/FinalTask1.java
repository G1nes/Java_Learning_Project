package Tasks;

import java.util.Scanner;

public class FinalTask1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i=1;i<=10;i++){
            int tmp = q*i;
            System.out.println(q+"*"+i+"="+tmp);
        }
    }
}
