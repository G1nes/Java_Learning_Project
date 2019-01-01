package TasksJava2.CandyGift;

public class Gift {
private double priceResult=0;
private double weightResult=0;
private String description="";

    public Gift(Candy someCandy, Jellybean someJellybean, ChocolateBar someChocolateBar){
    priceResult = someCandy.getPrice()+someJellybean.getPrice()+someChocolateBar.getPrice();
    weightResult = someCandy.getWeight()+someJellybean.getWeight()+someChocolateBar.getWeight();
    description = "This New Year gift include:\n"
            +someCandy.getName()+" - the taste is "+someCandy.getTaste()+", it cost "+someCandy.getPrice()+", weight is "+someCandy.getWeight()+"\n"
            +someJellybean.getName()+" - the taste is - "+someJellybean.getTaste()+", it cost "+someJellybean.getPrice()+", weight is "+someJellybean.getWeight()+"\n"
            +someChocolateBar.getName()+" - the taste is - "+someChocolateBar.getTaste()+", it cost "+someChocolateBar.getPrice()+", weight is "+someChocolateBar.getWeight()+"\n";
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
    @Override
    public String toString (){

    }
}
