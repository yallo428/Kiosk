package domain.Items;

import domain.store.Key;

public class Ade extends Menu {

    private final int price;
    public Ade(String name, String text, int price) {
        super(name, text, Key.ADE);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName() + " | " + price + " | " + this.getText();
    }
}
