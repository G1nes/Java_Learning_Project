package TasksJava2.WordsCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordsCounter {
    public static void main (String [] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Java_Learning_Project\\src\\TasksJava2\\WordsCounter\\File.txt"))){
            TreeMap<String,Integer> tm = new TreeMap<>();
            String s;
            int counter=0;
            while((s = br.readLine())!=null) {
                for (String result : s.split(" ")){
                    String tmp = result;
                    for (String r1 : s.split(" ")){
                        if (tmp.equals(r1)){
                            counter++;
                        }
                    }
                    tm.put(result, counter);
                    counter=0;
                }
            }
            for (Map.Entry<String,Integer>tmp:tm.entrySet()){
                System.out.println(tmp.getKey()+" "+tmp.getValue());
            }
        }catch (FileNotFoundException e){
            e.getMessage();
            e.getStackTrace();
        }
    }
}
