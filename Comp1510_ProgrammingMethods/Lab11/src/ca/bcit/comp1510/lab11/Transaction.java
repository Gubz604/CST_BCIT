/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * This class creates a shopping cart via a Transaction object. A Transaction object uses an array to store the kinds of items in the cart.
 * It also has a total price as well as the item count of how many items are in the cart.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 */
public class Transaction {
    private Item[] cart;
    private double totalPrice;
    private int itemCount;

    public Transaction(int cartSize) {
        this.cart = new Item[cartSize];
        this.totalPrice = 0;
        this.itemCount = 0;
    }

    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        addToCart(item);
    }

    public void addToCart(Item item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                totalPrice += item.getPrice() * item.getQuantity();
                itemCount += item.getQuantity();
                return;
            }
        }
        
        increaseSize(3);
        addToCart(item);
    }

    public void increaseSize(int amount) {
        Item[] temp = new Item[cart.length + amount];
        
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        
        this.cart = temp;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cart Details:\n");
        
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                double totalItemPrice = cart[i].getPrice() * cart[i].getQuantity();
                builder.append(String.format("%s Quantity: %d Price: $%.2f\n", 
                    cart[i].getName(), cart[i].getQuantity(), totalItemPrice));
            }
        }
        
        builder.append(String.format("Total Cart Value: $%.2f", getTotalPrice()));
        return builder.toString();
    }
}
