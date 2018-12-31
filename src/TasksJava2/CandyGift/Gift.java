package TasksJava2.CandyGift;

public class Gift {
public double priceResult=0;
public double weightResult =0;

    public Gift(Candy someCandy, Jellybean someJellybean, ChocolateBar someChocolateBar){
    priceResult = someCandy.getPrice()+someJellybean.getPrice()+someChocolateBar.getPrice();
    weightResult = someCandy.getWeight()+someJellybean.getWeight()+someChocolateBar.getWeight();
    }
    public Gift(){
    }
    public double getWeight(){
        return weightResult;
    }
    public double getPrice(){
        return priceResult;
    }
}
