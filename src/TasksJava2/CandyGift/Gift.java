package TasksJava2.CandyGift;

public class Gift {
public double priceResult=0;
public double weightResult=0;
public String description="";

    public Gift(Candy someCandy, Jellybean someJellybean, ChocolateBar someChocolateBar){
    priceResult = someCandy.getPrice()+someJellybean.getPrice()+someChocolateBar.getPrice();
    weightResult = someCandy.getWeight()+someJellybean.getWeight()+someChocolateBar.getWeight();
    description = "This New Year gift include:\n"+someCandy.getName()+" - the taste is - "+someCandy.getTaste()+"\n"
            +someJellybean.getName()+" - the taste is - "+someJellybean.getTaste()+"\n"
            +someChocolateBar.getName()+" - the taste is - "+someChocolateBar.getTaste()+"\n";
    }
    public Gift(){
    }
    public double getWeight(){
        return weightResult;
    }
    public double getPrice(){
        return priceResult;
    }
    public String getDescription(){
        return description;
    }
}
