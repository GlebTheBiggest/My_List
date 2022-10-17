package models.main;

import models.myList.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> numberList = new MyArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(9);
        numberList.add(4);
        numberList.add(7);
        numberList.add(9);
        numberList.add(0);
        numberList.add(-5);
        numberList.add(41);
        System.out.println("All entries: ");
        numberList.getAll();
        System.out.println("---------------------------");
        numberList.delete(0);
        System.out.println("All entries without element[0]: ");
        numberList.getAll();
        System.out.println("---------------------------");
        System.out.println("New element[0]: " + numberList.get(0));
        numberList.set(0, 999);
        System.out.println("---------------------------");
        System.out.println("All entries with new element[0]");
        numberList.getAll();
        System.out.println("---------------------------");
        System.out.println("Index of {41}: " + numberList.indexOf(41));
        System.out.println("Size: " + numberList.size());
        System.out.println("Is list empty: " + numberList.isEmpty());
        System.out.println("Does it have number 5: " + numberList.contains(-5));
        numberList.addAll(arrayList);
        System.out.println("---------------------------");
        System.out.println("Result of rewriting of list with other one: ");
        numberList.getAll();
    }
}