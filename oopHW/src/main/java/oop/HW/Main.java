package oop.HW;
/*
1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группы
*/

public class Main {
    public static void main(String[] args) {
        User userOne = new User();
        Basket userOneBasket = new Basket();
        //!!! Логин - Stas
        userOne.setLogin("Stas");
        //!!! Пароль - Sergo1243
        userOne.setPasword("Sergo1243");
        userOne.Register();
        Categoriya hosTovars = new Categoriya("Хозтовары");
        Categoriya eat = new Categoriya("Еда");
        Tovar tovarOne = new Tovar("Ручка", 12.9, 4.2);
        Tovar tovarTwo = new Tovar("Карандаш", 8.0, 3.5);
        Tovar tovarThree = new Tovar("Хлеб", 25.9, 4.7);
        Tovar tovarFour = new Tovar("Сыр", 112.9, 3.8);
        eat.setEattovars(tovarThree);
        eat.setEattovars(tovarFour);
        hosTovars.setHostovars(tovarOne);
        hosTovars.setHostovars(tovarTwo);

        System.out.println("\n" + eat.getName());
        for (int i = 0; i < eat.getEattovars().size(); i++){
            System.out.println("Товар №" + (i + 1) + " - " + eat.getEattovars().get(i) + "\n");
        }
        System.out.println(hosTovars.getName());
        for(int i = 0; i < hosTovars.getHostovars().size(); i++){
            System.out.println("Товар №" + (i + 1) + " - " + hosTovars.getHostovars().get(i) + "\n");
        }
        userOne.printConsol(userOneBasket);
    }
}