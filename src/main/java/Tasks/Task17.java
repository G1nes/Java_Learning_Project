package Tasks;

import java.io.*;

public class Task17 {
    public static void main (String [] args) throws IOException {
        String showMeData;
        int stringCounter=0;
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\ссылки на задачи\\Задача 17.txt"))){

            while ((showMeData=br.readLine())!=null) {
                stringCounter++;
                System.out.println(showMeData);
            }
        }catch(IOException e){
            System.out.println("Ошибка чтения");
        }
        try(FileWriter fw = new FileWriter("E:\\ссылки на задачи\\Задача 17.txt",false)){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i=1;i<=stringCounter;i++){
                String s = br.readLine();
                fw.write(s+"\r\n");
            }
        }catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }
}
