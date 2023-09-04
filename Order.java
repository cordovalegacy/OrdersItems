import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean isReady;
    public ArrayList<Item> items;

    public Order() {
        items = new ArrayList<>(); // Initialize the ArrayList in the constructor
    }

}