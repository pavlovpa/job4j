package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private Project project;

    public Engineer(String firstName, String secondName, String education, int experience) {
        super(firstName, secondName, education, experience);
    }

    public String getProject() {
        return project.getName();
    }

    public int condition(Project project) {
        return project.getDeadline();
    }

}
