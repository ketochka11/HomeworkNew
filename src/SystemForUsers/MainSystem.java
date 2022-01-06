package SystemForUsers;

import java.util.*;
//У вас должен быть класс с приватным статическим полем Map в котором ключ - это класс Person
// а значение это лист стрингов(которые являются действиями пользователя).
// Соответственно должен быть класс Person - поля на ваше усмотрение,
// но должны быть обязательно правильно переопределены иквалс и хэшкод.
//        В классе с мапой сделайте 3 статических метода.
//        Первый - по добавлению действия для Person (на вход принимает Person и String).
//        Второй метод - по очистке всех действий пользователя - на вход принимает только
//        Person. И третий - по выводу всех пользователей и их действий - на вход ничего
//        не принимает.
//        В Классе Main создать несколько пользователей и
//        1 - добавить несколько действий в нашу мапу через наш метод каждому пользователю.
//        2 - вывести всех персонов из нашей мапы через наш метод
//        3 - удалить все действия по одному персону из нашей мапы через наш метод
//        4 - Вывести еще раз всех пользователей из нашей мапы через наш метод
public class MainSystem {
    public static void main(String[] args) {

        Person person1 = new Person("Светлана Бразговка");
        Person person2 = new Person("Антон Петров");
        Person person3 = new Person("Дмитрий Смирнов");
        ArrayList<String> actList1 = new ArrayList<>();
        actList1.add("open file");
        actList1.add("copy file");
        actList1.add("load file");

        ArrayList<String> actList2 = new ArrayList<>();
        actList2.add("watch video");
        actList2.add("delete file");
        actList2.add("create new file");

        ArrayList<String> actList3 = new ArrayList<>();
        actList3.add("open file");
        actList3.add("rename file");
        actList3.add("change file");

        System1.getPersonMap().put(person1,actList1);
        System1.getPersonMap().put(person2,actList2);
        System1.getPersonMap().put(person3,actList3);


        System.out.println(System1.showAllUsers(System1.getPersonMap()));
        System1.addActUser(person1, "play game");
        System1.addActUser(person2, "load new application");
        System1.addActUser(person3, "open browser");
        System.out.println(System1.showAllUsers(System1.getPersonMap()));
        System1.delActions(person3);
        System.out.println(System1.showAllUsers(System1.getPersonMap()));
    }
}
