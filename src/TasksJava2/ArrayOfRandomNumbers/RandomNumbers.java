package TasksJava2.ArrayOfRandomNumbers;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    public static void main (String [] args){
        swipeMaxAndMin(arrayInitialize());
    }
    private static ArrayList<Integer> arrayInitialize (){
        ArrayList<Integer> array = new ArrayList<>();
        int min=-10,max=10;
        int diff = max-min;
        int tmp;
        for (int i=0;i<20;i++){
            Random random = new Random();
            tmp = random.nextInt(diff+1)+min;
            if (array.contains(tmp)) {
                i--;
            }else {
                array.add(tmp);
            }
        }
        return array;
    }
    private static void swipeMaxAndMin (ArrayList <Integer> someArray){
        int maxOfNegative=someArray.get(0);
        int maxIndex=0;
        int minOfPositive=someArray.get(0);
        int minIndex=0;
        //Найти любой элемент больше нуля и любой меньше нуля
        for (int i=0;i<someArray.size();i++){
            if (someArray.get(i)>0){
                minOfPositive = someArray.get(i);
                break;
            }
        }
        for (int i=0;i<someArray.size();i++){
            if (someArray.get(i)<0){
                maxOfNegative = someArray.get(i);
                break;
            }
        }
        //Найти максимальный отрицательный и минимальный позитивный
        for (int i = 0;i<someArray.size();i++){
            if (maxOfNegative<someArray.get(i)&&someArray.get(i)<0)
            {
                maxOfNegative = someArray.get(i);
                maxIndex = i;
            }
            if (minOfPositive>someArray.get(i)&&someArray.get(i)>0)
            {
                minOfPositive = someArray.get(i);
                minIndex = i;
            }
        }
        System.out.println(someArray);
        //Меняем местами
        int tmp = someArray.get(minIndex);
        someArray.set(minIndex, someArray.get(maxIndex));
        someArray.set(maxIndex, tmp);
        System.out.println(someArray);

    }
}
