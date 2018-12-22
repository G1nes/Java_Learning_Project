package Tasks;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task16 {
    public static void main (String [] args) throws IOException {
        String string;
        Scanner sc = new Scanner(System.in);
        try (FileWriter fos = new FileWriter("E:\\ссылки на задачи\\Задача 16.txt",true)) {
             do {
                 string = sc.nextLine();
                 if (!string.equals("stop")){
                     fos.write(string + "\r\n");
                 }else{
                     break;
                 }
             }
            while(!string.equals("stop"));

        }
        catch (IOException e){
            System.out.println("Ошибка");
        }
    }
}
