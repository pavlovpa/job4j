package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item("teacher");
        Item item2 = new Item("tutor");
        Item item3 = new Item("student");
        Item item4 = new Item("man");
        Item item5 = new Item("dog");
        Item item6 = new Item("teacher");

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);

        //System.out.println(tracker.findById(1) + "\n");
        System.out.println(Arrays.toString(tracker.findByName("teacher")));
        //System.out.println(Arrays.toString(tracker.findAll()) + "\n");
    }
}
