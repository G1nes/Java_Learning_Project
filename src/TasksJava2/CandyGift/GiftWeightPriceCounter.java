package TasksJava2.CandyGift;

public class GiftWeightPriceCounter {
    public static void main (String [] args){
        Gift g1 = new Gift(
                new Candy("123",123,86795,"like shit"),
                new Jellybean("124",123.5,68799,"nice!"),
                new ChocolateBar("125",666,87100,"smells like teen spirit"));
        System.out.println("Total price is: "+g1.getPrice()+"\nTotal weight is: "+g1.getWeight()+"\n"+g1.getDescription());
    }
}
