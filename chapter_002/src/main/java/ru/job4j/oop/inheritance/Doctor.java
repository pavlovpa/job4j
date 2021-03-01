package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }
}
