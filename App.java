import static java.lang.System.out;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        out.println("<----Running App---->");

        //Instances
        Item item1 = new Item("Drip", 5.50);
        Item item2 = new Item("Tea", 3.50);
        Item item3 = new Item("Latte", 6.50);
        Item item4 = new Item("Mocha", 6.25);

        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);

        Order order1 = new Order("Brendan", item1.price, false, itemsList);
        Order order2 = new Order("Tori", item2.price, false, itemsList);
        Order order3 = new Order("Charlie", item3.price, false, itemsList);
        Order order4 = new Order("Bella", item4.price, false, itemsList);

        //Method Calls
        out.println(item1.name + ": " + item1.price);
        out.println(order1.price);
    }
}