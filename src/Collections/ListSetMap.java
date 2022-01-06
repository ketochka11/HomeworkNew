package Collections;

import java.util.*;
//Как одной строчкой преобразовать ArrayList в HashSet?
//Как одной строчкой преобразовать HashSet в ArrayList?
//Сделайте HashSet из ключей HashMap.
public class ListSetMap {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(); //создаем ArrayList1
        list1.add(1);
        list1.add(5);
        list1.add(8);
        list1.add(12);
        list1.add(154);
        list1.add(558); //заполняем
        System.out.println("List1: " + list1); //выводим на экран

        Set<Integer> set1 = new HashSet<>(list1); //создаем hASHSet из list1
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new HashSet<>(); //создаем Set2
        set2.addAll(list1);//добавляем в set2 все объекты list1
        System.out.println("Set2: " + set2);



        List<Integer> list2 = new ArrayList<>(set1); //создаем ArrayList2 из элементов set1
        System.out.println("List2: " + list2);

        List<Integer> list3 = new ArrayList<>(); //создаем ArrayList3
        list3.addAll(set1); // добавляем объекты из set1
        System.out.println("List3: " + list3);

        Map <Integer, String> map1 = new HashMap();//создаем HashMap
        map1.put(1,"Monday");
        map1.put(2,"Tuesday");
        map1.put(3,"Wednesday");
        map1.put(4,"Thursday");
        map1.put(5,"Friday");
        map1.put(6,"Saturday");
        map1.put(7,"Sunday"); //добавляем элементы
        System.out.println("Map1: \n" + map1);

        set2.removeAll(set2); //чтобы не создавать новый hashset удаляем все элементы из set2
        set2.addAll(map1.keySet()); //добавляем ключи map1 в set2
        System.out.println("Set2: " + set2);
    }
}