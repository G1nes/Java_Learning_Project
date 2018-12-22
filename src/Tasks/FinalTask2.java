package Tasks;

public class FinalTask2 {
    public static void main (String [] args){
        int [] list = {5,6,100,135,98,1,10};
        showMeArray(bubbleSort(list));
    }
    public static int [] bubbleSort (int [] someArray){
        int [] bubble = someArray;
        int temp;
        for (int i=bubble.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (bubble[j]>bubble[j+1]){
                    temp = bubble[j];
                    bubble [j] = bubble [j+1];
                    bubble [j+1] = temp;
                }
            }
        }
        return bubble;
    }
    public static void showMeArray (int [] someArray){
        for (int i=0;i<someArray.length;i++){
            System.out.print(someArray[i]+" ");
        }
    }
}
