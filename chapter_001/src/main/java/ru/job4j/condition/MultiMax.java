package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= third) {
            third = second;
        } else {
            second = third;
        }
        if (second >= result) {
            result = second;
        }
        return result;
    }
}
