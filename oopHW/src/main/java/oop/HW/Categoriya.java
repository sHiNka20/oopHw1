package oop.HW;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Categoriya {
    private final ArrayList<Tovar> hostovars = new ArrayList<>();
    private final ArrayList<Tovar> eattovars = new ArrayList<>();
    private String name;

    public Categoriya(String name){
        this.name = name;
    }

    public Categoriya(){
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tovar> getHostovars() {
        return hostovars;
    }

    public void setHostovars(Tovar tov) {
        this.hostovars.add(tov);
    }

    public ArrayList<Tovar> getEattovars() {
        return eattovars;
    }

    public void setEattovars(Tovar eat) {
        this.eattovars.add(eat);
    }
}
