package domain.Items;


import exception.InvalidChoiceException;


public enum Size {
    DEFAULT(1, 0),
    TALL(2, 500),
    GRANDE(3, 1000),
    VENTI(4, 1500);
    private int num;
    private int price;

    Size(int num, int price) {
        this.num = num;
        this.price = price;
    }


    public static Size findSize(int num) {
        for (Size size : Size.values()) {
            if (size.num == num) {
                return size;
            }
        }
        throw new InvalidChoiceException();
    }

    public int getPrice(){
        return price;
    }

    public int getNum(){
        return num;
    }
}
