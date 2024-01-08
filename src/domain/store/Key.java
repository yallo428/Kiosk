package domain.store;

import exception.InvalidChoiceException;

public enum Key {
    COFFEE(1),
    ADE(2),
    DESSERT(3);

    private int num;

    Key(int num) {
        this.num = num;
    }

    public static Key findKey(int num) {
        for (Key key : Key.values()) {
            if (num == key.getKey()) {
                return key;
            }
        }
        throw new InvalidChoiceException();
    }

    private int getKey() {
        return num;
    }

}
