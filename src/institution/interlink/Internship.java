package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class Internship {
	
    private String name;
    private List<Student> students;
	
    public Internship(String name) {
       this.name = name;
    }

    public String getName() {
		return name;
    }
    public void setName(String name) {
		this.name = name;
    }

    public void setStudent(Student student) {
       if(students == null) {
           students = new ArrayList<>();
        }
           students.add(student);
    }

    public String getStudents() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
		sb.append(student.getName()+"\n");
	  }
        String list = sb.toString();
        return list;
    }
}
