package ru.job4j.oop;

public class Profession {
    String name, surname, education, birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public class Doctor extends Profession {
        public Doctor() {
            super();
        }

        String diagnose, prescription, treatment;

        public String getDiagnose() {
        }

        public String prescribe() {
            return treatment;
        }

        public String write() {
            return prescription;
        }

    }

    public class Engineer extends Profession {
        public Engineer() {
            super();
        }

        String task, decision;

        public String getTask() {

        }
        public String makeDecision() {

        }
    }

}