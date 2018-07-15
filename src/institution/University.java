package institution;

import java.util.ArrayList;
import java.util.List;

import institution.interlink.Internship;
import person.Student;

public class University {
    
	private static int MIDLEVEL = 5;
	
	private String name;
	private List<Student> students;
	private Internship interShip;
	
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


	public Internship getInterShip() {
		return interShip;
	}

	public void setInterShip(Internship interShip) {
		this.interShip = interShip;
	}

	public void setStudent(Student student) {
		if(student.getKnowledge().getLevel() > MIDLEVEL) {
			interShip.setStudent(student);
		}
    }

    public void addStudent(Student student) {
    	if(students == null) {
        	students = new ArrayList<>();
        }
        students.add(student);
    }
}
