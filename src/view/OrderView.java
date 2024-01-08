package view;

import domain.order.OrderItem;

import java.util.List;

public class OrderView {


    public OrderView(){

    }


    public void show(List<OrderItem> orderItemList, int totalPrice){
        System.out.println("[Orders]");
        for(OrderItem orderItem : orderItemList){
            System.out.println(orderItem);
        }
        System.out.println("[ Total ]");
        System.out.println(totalPrice);

        System.out.println("1. 주문    2. 메뉴판");
    }

    public void completeView(){
        System.out.println("주문이 완료되었습니다!");
    }
}
