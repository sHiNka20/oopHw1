package oop.HW;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class User {
    private String login;
    private String pasword;
    public Scanner read = new Scanner(System.in);

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public void Register(){
        System.out.println("Введите логин : ");
        String log = read.next();
        if(log.equals(login) || login == null){
            System.out.println("Введите пароль : ");
            String pas = read.next();
            if(pas.equals(pasword) || pasword == null){
                login = log;
            }
            else {
                System.out.println("Пароль не верный!");
                Register();
            }
        }
        else {
            System.out.println("Логин не верный!");
            Register();
        }
    }

    public void printConsol(Basket basket){
        System.out.println("Выберете категорию, например: 1 (Еда)");
        int v = Integer.parseInt(read.next());
        switch (v){
            case 1:
                System.out.println("Выберете товар, например: 1 (Хлеб)");
                int vTwo = Integer.parseInt(read.next());
                switch (vTwo){
                    case 1:
                        basket.setTovars();
                }
        }
    }
}
