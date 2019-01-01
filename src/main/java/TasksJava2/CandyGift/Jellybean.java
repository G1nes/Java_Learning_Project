package main.java.TasksJava2.CandyGift;

public class Jellybean extends Gift{
    private String name;
    private double price;
    private double weight;
    private String taste;
    public static Jellybean jb1 = new Jellybean("Harry Potter beans",350,200,"like soсks");
    private Jellybean (String name, double price, double weight, String taste){
        this.name = name;
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
    public String getName(){
        return name;
    }
    public String getTaste(){
        return taste;
    }
}
