package ru.job4j.oop.inheritance;

public class Builder {
    private String skills;

    public String getSkills() {
        return skills;
    }

    public String communication(Building building) {
        return building.getCommunication();
    }
}
