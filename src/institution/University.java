package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class University {

	private String name;
	private List<Student> students;
	private List<Student> studentsForIntership;
	
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

	public List<Student> getStudentsForIntership() {
		return studentsForIntership;
	}

	public void setStudent(Student student) {
		if(student.getKnowledge().getLevel() > midLevel()) {
			if(studentsForIntership == null) {
				studentsForIntership = new ArrayList<>();
	        }
			studentsForIntership.add(student);
		}
    }

    public void addStudent(Student student) {
    	if(students == null) {
        	students = new ArrayList<>();
        }
        students.add(student);
    }
    
    public int midLevel() {
    	int sumLevel = 0;
    	int countOfStudents = students.size();
    	
    	for (Student student : students) {
    		sumLevel += student.getKnowledge().getLevel();
		}
    	int midLevel = sumLevel/countOfStudents;
    	
    	return midLevel;
    }
}
