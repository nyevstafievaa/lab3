package lab3.controller;

import lab3.model.Group;
import lab3.model.Sex;
import lab3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}