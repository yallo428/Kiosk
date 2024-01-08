package domain.Items;

import lombok.Getter;
import domain.store.Key;



public abstract class Menu {
    private String name;
    private String text;

    private Key key;



    public Menu(String name, String text, Key key) {
        this.name = name;
        this.text = text;
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public abstract int getPrice();
}
