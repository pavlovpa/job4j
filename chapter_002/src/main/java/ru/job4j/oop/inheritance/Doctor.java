package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String firstName, String secondName, String education, int experience) {
        super(firstName, secondName, education, experience);
    }

    public String getSpecialization() {
        return specialization;
    }

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }
}
