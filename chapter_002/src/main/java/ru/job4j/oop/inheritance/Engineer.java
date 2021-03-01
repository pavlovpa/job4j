package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private Project project;

    public String getProject() {
        return project.getName();
    }

    public int condition(Project project) {
        return project.getDeadline();
    }

}
