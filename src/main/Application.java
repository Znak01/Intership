package main;

import java.util.List;

import factory.StudentFactory;
import factory.random.RandomStudents;
import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
    	
    	StudentFactory studentFactory = new RandomStudents();
    	List<Student> students = studentFactory.createStudents();
    	
        University university = new University("CH.U.I.");
        for (Student student : students) {
			university.addStudent(student);
		}
        for (Student student : students) {
			university.setStudent(student);
		}

        Internship internship = new Internship("Interlink");
        for (Student student : university.getStudentsForIntership()) {
        	internship.setStudent(student);
		}
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
