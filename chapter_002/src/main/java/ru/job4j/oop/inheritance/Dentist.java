package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private float rate;

    public Dentist(String firstName, String secondName, String education, int experience) {
        super(firstName, secondName, education, experience);
    }

    public float getRate() {
        return rate;
    }

    public float bill(int hours) {
        return (getRate() * hours);
    }
}
