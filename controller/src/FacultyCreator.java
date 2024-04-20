package lab3.controller;

import lab3.model.Faculty;
import lab3.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
