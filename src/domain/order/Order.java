package domain.order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems = new ArrayList<>();

    private int totalPrice;

    public List<OrderItem> getOrderItemList(){
        return orderItems;
    }
    public int getTotalPrice() {
        return totalPrice;
    }

    public void save(OrderItem orderItem){
        orderItems.add(orderItem);
        totalPrice += orderItem.getTotalPrice();
    }
    public void cancel(){
        orderItems.clear();
    }


}
