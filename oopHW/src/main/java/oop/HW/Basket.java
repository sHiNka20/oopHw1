package oop.HW;

import java.util.ArrayList;

public class Basket extends User{
    private ArrayList<Tovar> tovars = new ArrayList<Tovar>();

    public ArrayList<Tovar> getTovars() {
        return tovars;
    }

    public void setTovars(Tovar tov) {
        this.tovars.add(tov);
    }
}
