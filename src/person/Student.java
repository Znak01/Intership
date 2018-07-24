package person;

import person.consciousness.Knowledge;

public class Student {
	
	private String name;
	private Knowledge knowledge;
	
    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knowledge getKnowledge() {
		return knowledge;
	}
}