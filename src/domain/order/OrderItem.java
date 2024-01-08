package domain.order;

import domain.Items.Size;
import domain.Items.Menu;

public class OrderItem {

    private Menu menu;
    private Size size;
    private int totalPrice;
    private int quantity;

    public OrderItem(Menu menu, int quantity, Size size){
        this.menu = menu;
        this.size = size;
        this.quantity = quantity;
        setTotalPrice();
    }

    private void setTotalPrice(){
        totalPrice = (menu.getPrice() + size.getPrice()) * quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return menu.getName() + "("+ size +")" + " | " + quantity +" | " + totalPrice;
    }
}
