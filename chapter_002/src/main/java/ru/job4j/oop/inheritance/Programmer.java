package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String level;
    private boolean busyness;

    public Programmer(String firstName, String secondName, String education,
                      int experience, String level, boolean busyness) {
        super(firstName, secondName, education, experience);
        this.level = level;
        this.busyness = busyness;
    }

    public String getLevel() {
        return level;
    }

    public boolean isBusy() {
        return busyness;
    }
}
