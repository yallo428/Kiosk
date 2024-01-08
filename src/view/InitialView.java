package view;

import domain.store.Key;

import java.util.LinkedHashSet;
import java.util.Set;

public class InitialView {

    private int index = 1;
    public void show(Set<Key> keys){
        header();
        center(keys);
        footer();
    }

    private void header(){
        System.out.println("MY CAFE에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
    }

    private void center(Set<Key> keys){
        System.out.println("[CAFE MENU]");
        for(Key key : keys){
            System.out.println(index++ + "." + key);
        }
    }

    private void footer(){
        System.out.println("[Order MENU]");
        System.out.println(index++ + ".ORDER");
        System.out.println(index++ + ".CANCEL");
        index = 1;
    }
}
