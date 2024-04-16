package lab3.controller;

import lab3.ComponentCreator;
import lab3.model.University;

public class Run {
    public static void main(String[] args) {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        UniversityCreator universityCreator = new UniversityCreator(componentCreator);
        University university = universityCreator.createTypicalUniversity("NTU DP");
    }
}