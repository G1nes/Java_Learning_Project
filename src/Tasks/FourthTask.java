package Tasks;

import java.util.Scanner;

public class FourthTask {
    public static void main () {
        int x=1, y=2,z=3;
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        if (q==x||q==y||q==z) {
            System.out.println("Данное значение имеется в константах");
        }else{
            System.out.println("Такой константы нет!");
        }
    }
}
