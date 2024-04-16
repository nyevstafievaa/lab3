package lab.lab3;

import lab3.model.*;

public interface ComponentCreator {
    Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group);
    UniversityComponent createUniversity(String name);
    Faculty createFaculty(String name, Human head);
    UniversityComponent createDepartment(String name, Human head);
}