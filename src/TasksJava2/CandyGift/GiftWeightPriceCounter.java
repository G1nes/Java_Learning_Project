package TasksJava2.CandyGift;

public class GiftWeightPriceCounter {
    public static void main (String [] args){
        Gift g1 = new Gift(
                new Candy("123",123,-5,"like shit"),
                new Jellybean("124",-123.5,9999.5,"nice!"),
                new ChocolateBar("125",666,-1000,"smells like teen spirit"));
        System.out.println("Total price is: "+g1.getPrice()+"\nTotal weight is: "+g1.getWeight()+"\n"+g1.getDescription());
    }
}
