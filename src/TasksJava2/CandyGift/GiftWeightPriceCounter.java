package TasksJava2.CandyGift;

public class GiftWeightPriceCounter {
    public static void main (String [] args){
        Gift g1 = new Gift(
                Candy.c1,
                Jellybean.jb1,
                ChocolateBar.cb1);
        System.out.println("Total price is: "+g1.getPrice()+"\nTotal weight is: "+g1.getWeight()+"\n"+g1.getDescription());
    }
}
