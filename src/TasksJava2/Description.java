package TasksJava2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Description {
    public static void readCommand(String showMe) throws IOException{
        showMe = showMe.toLowerCase();
        showMe = showMe.replaceAll("\\s+","");
        if (showMe.equals("showme")){
            showDescription();
        }
    }
    public static void showDescription () throws IOException {
        try(FileReader fr = new FileReader("E:\\Java_Learning_Project\\src\\TasksJava2\\Description.txt")){

        }catch (FileNotFoundException e){
            System.out.println("Can`t find file");
        }
    }
}
