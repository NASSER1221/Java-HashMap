import java.util.HashMap;
import java.util.Map;


public class InventoryManager {


    private Map<String, Integer> inventory = new HashMap<>();
    public InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }
    /**
     * TO-DO: Add 'quantityToAdd' to the stock of 'itemName'.
     * If 'itemName' doesn't exist, add it to the map with that quantity.
     \*
     * @param itemName The name of the item to restock.
     * @param quantityToAdd The number of items to add.
     */
    public void restockItem(String itemName, int quantityToAdd) {
        // Hint: Use getOrDefault() to simplify your code.
        // Your code here

       if(getInventory().getOrDefault(itemName,quantityToAdd)==quantityToAdd){

           getInventory().put(itemName,quantityToAdd);
       }
       else{
           getInventory().put(itemName, getInventory().get(itemName)+quantityToAdd);
       }
    }
    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public static void main(String[] args) {
        InventoryManager o=new InventoryManager();


   o.restockItem("Apples",30);
   o.restockItem("banana",70);
        System.out.println(o.getInventory());
    }



}
