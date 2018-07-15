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
        
//        university.addStudent(new Student("Andrew Kostenko"));
//        university.addStudent(new Student("Julia Veselkina"));
//        university.addStudent(new Student("Maria Perechrest"));

        university.setInterShip(new Internship("Interlink"));
        for (Student student : university.getStudents()) {
			university.setStudent(student);
		}
        System.out.println("List of internship's students:");
        System.out.println(university.getInterShip().getStudents());
        
//        Internship internship = new Internship("Interlink");
//        System.out.println("List of internship's students:");
//        System.out.println(internship.getStudents());
    }
}
