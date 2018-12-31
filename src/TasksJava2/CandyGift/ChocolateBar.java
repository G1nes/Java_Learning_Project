package TasksJava2.CandyGift;

public class ChocolateBar extends Gift{
    private double price;
    private double weight;
    private String taste;

    public ChocolateBar (double price, double weight, String taste){
        this.price=price;
        this.weight=weight;
        this.taste = taste;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}
