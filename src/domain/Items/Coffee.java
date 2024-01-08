package domain.Items;

import domain.store.Key;

public class Coffee extends Menu {

    private final int price;
    public Coffee(String name, String text, int price) {
        super(name, text, Key.COFFEE);
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
