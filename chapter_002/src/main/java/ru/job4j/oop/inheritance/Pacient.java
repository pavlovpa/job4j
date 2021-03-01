package ru.job4j.oop.inheritance;

public class Pacient {
    private String firstName;
    private String secondName;
    private int age;
    private Diagnosis diagnosis;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
