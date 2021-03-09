package ru.job4j.oop.inheritance;

public class Profession {
    private String firstName;
    private String secondName;
    private String education;
    private int experience;

    public Profession(String firstName, String secondName, String education, int experience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.education = education;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEducation() {
        return education;
    }

    public int getExperience() {
        return experience;
    }
}
