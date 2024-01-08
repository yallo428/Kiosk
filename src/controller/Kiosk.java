package controller;

import domain.Items.Size;
import domain.Items.Menu;
import domain.order.Order;
import domain.order.OrderItem;
import domain.store.Key;
import domain.store.Store;
import exception.InvalidChoiceException;
import view.InitialView;
import view.OrderView;
import view.PurchaseView;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //TODO : 아이템마다 고유 번호 추가하기
    private final Scanner sc = new Scanner(System.in);
    private final InitialView initialView = new InitialView();
    private final OrderView orderView = new OrderView();
    private final PurchaseView purchaseView = new PurchaseView();
    private final Store store = new Store();
    private final Order order = new Order();



    public Kiosk() {
        while (true) {
            initialView.show(store.getKeys());
            int num = sc.nextInt();
            switch (num) {
                case 1, 2, 3 -> {
                    showPurchaseView(store.find(num));
                }
                case 4 -> {
                    showOrderView();
                }
                case 5 -> {
                    order.cancel();
                }
            }
        }
    }

    private void showPurchaseView(List<Menu> menuList) {
        purchaseView.showView(menuList);
        try {
            Menu menu = selectMenu(menuList);
            Size size = selectSize(menu);

            purchaseView.showQuantityChooseView();
            int quantity = sc.nextInt();

            orderCheck(menu, quantity, size);

        }catch (InvalidChoiceException e){
            System.out.println(e.getMessage());
        }
    }

    private void orderCheck(Menu menu, int quantity, Size size) {
        OrderItem orderItem = new OrderItem(menu, quantity, size);
        purchaseView.showCheckView(orderItem);

        if(sc.nextInt() == 1){
            order.save(orderItem);
        }
    }

    private Menu selectMenu(List<Menu> menuList){
        int num = sc.nextInt() - 1;
        if(num < 0 || num >= menuList.size()){
            throw new InvalidChoiceException();
        }
        return menuList.get(num);
    }

    private Size selectSize(Menu menu) {
        if(menu.getKey() == Key.DESSERT){
            return Size.DEFAULT;
        }
        purchaseView.showSizeChooseView();
        return Size.findSize(sc.nextInt());
    }

    private void showOrderView() {
        orderView.show(order.getOrderItemList(), order.getTotalPrice());
        try {
            if(sc.nextInt() == 1){
                orderView.completeView();
                order.cancel();
                Thread.sleep(300);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

}
