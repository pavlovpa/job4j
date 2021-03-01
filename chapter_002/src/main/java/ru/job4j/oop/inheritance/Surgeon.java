package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private int operationsPerDay;

    public int getOperationsPerDay() {
        return operationsPerDay;
    }

    public void cure(Pacient pacient) { }
}
