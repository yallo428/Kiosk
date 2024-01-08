package domain.store;

import domain.Items.Ade;
import domain.Items.Coffee;
import domain.Items.Dessert;
import domain.Items.Menu;

import java.util.*;

public class Store {

    private final Map<Key, ArrayList<Menu>> store = new LinkedHashMap<>();

    public Store(){
        init();
    }
    private void init(){
        for(Key key : Key.values()){
            store.put(key, new ArrayList<>());
        }

        store.get(Key.COFFEE).add(new Coffee("아메리카노", "에스프레소를 뜨거운 물로 농도를 희석하여 마시는 커피 음료", 3000));
        store.get(Key.COFFEE).add(new Coffee("캬라멜 마끼아또", "라테 마키아토는 우유 거품과 에스프레소를 넣은 커피", 3500));
        store.get(Key.COFFEE).add(new Coffee("에스프레소", "고압·고온 하의 물을 미세하게 분쇄한 커피 가루에 가해 추출해내는 고농축 커피", 4000));

        store.get(Key.ADE).add(new Ade("레몬 에이드", "레몬에이드는 레몬향이 나는 음료", 3500));
        store.get(Key.ADE).add(new Ade("자몽 에이드", "자몽향이 나는 음료", 3500));
        store.get(Key.ADE).add(new Ade("체리콕", "새콤달콤한 그 체리향과 콜라의 조합", 4000));

        store.get(Key.DESSERT).add(new Dessert("딸기 케이크", "주 재료로서 딸기를 사용하는 케이크", 5000));
        store.get(Key.DESSERT).add(new Dessert("초코 케이크", "주 재료로서 초코를 사용하는 케이크", 5000));
        store.get(Key.DESSERT).add(new Dessert("허니브레드", "노릇하게 구운 식빵에 버터와 꿀을 발라 달달한 맛을 낸 디저트", 5000));
    }

    public void save(Key key, Menu menu){
        store.get(key).add(menu);
    }
    public ArrayList<Menu> find(int num){
        return store.get(Key.findKey(num));
    }

    public Set<Key> getKeys(){
        return store.keySet();
    }

}
