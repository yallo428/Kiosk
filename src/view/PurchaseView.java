package view;

import domain.Items.Size;
import domain.Items.Menu;
import domain.order.OrderItem;

import java.util.List;

public class PurchaseView {

    private int index = 1;
    public void showView(List<Menu> menuList){
        System.out.println("[MENU]");
        for(Menu menu : menuList){
            System.out.println(index++ + "." + menu);
        }
        index = 1;
    }

    public void showQuantityChooseView(){
        System.out.println("몇 개를 구입하시겠습니까?");
    }

    public void showSizeChooseView(){
        for(Size size : Size.values()){
            System.out.println(size.getNum() + ". " + size + "(" + size.getPrice() +")");
        }
    }

    public void showCheckView(OrderItem orderItem){
        System.out.println(orderItem);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인   2. 취소");
    }
}
