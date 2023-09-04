import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean isReady;
    public ArrayList<Item> items;

    public Order(String name, double total, boolean isReady, ArrayList<Item> items){
        this.name = name;
        this.total = total;
        this.isReady = isReady;
        this.items = items;
    }
}