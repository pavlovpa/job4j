package ru.job4j.oop.inheritance;

public class Dentist {
    private float rate;

    public float getRate() {
        return rate;
    }

    public float bill(int hours) {
        return (getRate() * hours);
    }
}
