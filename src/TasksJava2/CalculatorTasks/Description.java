package TasksJava2.CalculatorTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Description {
    public static String readCommand(String showMe) throws IOException{
        Scanner s = new Scanner(System.in);
        String tmp = showMe;
        showMe = showMe.toLowerCase();
        showMe = showMe.replaceAll("\\s+","");
        if (showMe.equals("showme")){
            showDescription();
            System.out.println("Please enter command");
            String tmp1 = s.nextLine();
            showMe= tmp1;
        }else{
            showMe= tmp;
        }
        return showMe;
    }
    public static void showDescription () throws IOException {
        try(BufferedReader br = new BufferedReader( new FileReader("E:\\Java_Learning_Project\\src\\TasksJava2\\Description.txt"))){
            String reader;
            while ((reader = br.readLine())!=null){
                System.out.println(reader);
            }
            br.close();
        }catch (FileNotFoundException e){
            System.out.println("Can`t find file");
        }
    }
}
