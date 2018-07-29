package institution;

import java.util.ArrayList;
import java.util.List;

import institution.interlink.Internship;
import person.Student;

public class University {

    private String name;
    private List<Student> students;
	
    public University(String name) {
        this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
	
    public List<Student> getStudents() {
	return students;
    }

    public void setStudent(Student student, Internship internship) {
	if(student.getKnowledge().getLevel() > midLevel()) {
		internship.setStudent(student);
	}
    }

    public void addStudent(Student student) {
    	if(students == null) {
        	students = new ArrayList<>();
        }
        students.add(student);
    }
    
    private int midLevel() {
    	if(students.size() == 0) {
    		return 0;
    	}
    	int sumLevel = 0;
    	int countOfStudents = students.size();
    	
    	for (Student student : students) {
    		sumLevel += student.getKnowledge().getLevel();
		}
    	int midLevel = sumLevel/countOfStudents;
    	
    	return midLevel;
    }
}
