package TasksJava2.CandyGift;

public class Jellybean extends Gift{
    private String name;
    private double price;
    private double weight;
    private String taste;
    public static Jellybean jb1 = new Jellybean("124",1,68799,"nice!");
    public Jellybean (String name, double price, double weight, String taste){
        this.name = name;
        this.price=price;
        this.weight=weight;
        this.taste = taste;
    }
    public double getPrice() {
        if (price<=0){
            System.out.println("Enter correct price for that Jellybean");
            return Math.abs(price);
        }else if (price>999){
            System.out.println("Is this made of gold? Ok, \"Pontorez\"");
            return price;
        }else {
            return price;
        }
    }
    public double getWeight() {
        if (weight<=0){
            System.out.println("You came to the wrong Universe");
            return Math.abs(weight);
        }else if (weight>999){
            System.out.println("Too heavy, let me made it little lighter");
            return weight-999;
        }else {
            return weight;
        }
    }
    public String getName(){
        return name;
    }
    public String getTaste(){
        return taste;
    }
}
