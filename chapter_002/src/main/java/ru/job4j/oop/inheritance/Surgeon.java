package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private int operationsPerDay;

    public Surgeon(String firstName, String secondName, String education, int experience) {
        super(firstName, secondName, education, experience, "Surgeon");
    }

    public int getOperationsPerDay() {
        return operationsPerDay;
    }

    public void cure(Pacient pacient) { }
}
