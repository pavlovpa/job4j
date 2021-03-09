package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String level;
    private boolean busyness;

    public Programmer(String firstName, String secondName, String education, int experience) {
        super(firstName, secondName, education, experience);
    }

    public String getLevel() {
        return level;
    }

    public boolean isBusy() {
        return busyness;
    }
}
