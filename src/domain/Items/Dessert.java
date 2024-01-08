package domain.Items;

import domain.store.Key;

public class Dessert extends Menu {
    private final int price;
    public Dessert(String name, String text, int price) {
        super(name, text, Key.DESSERT);
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
