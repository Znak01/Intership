package factory.random;

import java.util.ArrayList;
import java.util.List;

import factory.StudentFactory;
import person.Student;
import person.consciousness.Knowledge;

public class RandomStudents implements StudentFactory {

	@Override
	public List<Student> createStudents() {
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			Student s = new Student("Student" + i);
			s.setKnowledge(new Knowledge(i));
			students.add(s);
		}
		return students;
	}

	
	
}
