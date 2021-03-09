package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private float rate;

    public Dentist(String firstName, String secondName, String education,
                   int experience, String specialization, float rate) {
        super(firstName, secondName, education, experience, specialization);
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public float bill(int hours) {
        return (getRate() * hours);
    }
}
