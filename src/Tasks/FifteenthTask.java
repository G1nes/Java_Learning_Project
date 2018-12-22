package Tasks;

import java.io.*;

public class FifteenthTask {
    public static void main (String [] args) throws IOException {
        String s;
        try (BufferedReader buffer = new BufferedReader(new FileReader("E:\\ссылки на задачи\\Задача 15.txt"))){
            while ((s=buffer.readLine())!=null){
            System.out.println(s);
            }
        }catch (IOException e){
            System.out.println("=\\ файл не найден");
        }
    }
}
