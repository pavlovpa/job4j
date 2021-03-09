package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String firstName, String secondName, String education, int experience, String specialization) {
        super(firstName, secondName, education, experience);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }
}
