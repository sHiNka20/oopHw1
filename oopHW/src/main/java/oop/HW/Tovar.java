package oop.HW;

public class Tovar extends Categoriya {
    private double price;
    private double reyt;

    public Tovar(String name, double price, double reyt) {
        super(name);
        this.price = price;
        this.reyt = reyt;
    }

    public Tovar(){
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReyt() {
        return reyt;
    }

    public void setReyt(double reyt) {
        this.reyt = reyt;
    }

    @Override
    public String toString() {
        return "Товар - " + super.getName() +
                "\nЦена - " + price +
                "\nРейтинг -" + reyt;
    }
}
