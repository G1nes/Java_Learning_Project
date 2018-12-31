package TasksJava2.CandyGift;

public class Candy extends Gift{
    private String name;
    private double price;
    private double weight;
    private String taste;

    public Candy (String name, double price, double weight, String taste){
        this.name = name;
        this.price=price;
        this.weight=weight;
        this.taste=taste;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public String getName(){
        return name;
    }
}
