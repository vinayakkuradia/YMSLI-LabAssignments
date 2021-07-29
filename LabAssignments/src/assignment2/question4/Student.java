package assignment2.question4;

public class Student {
	String name=null, id=null;
	double grade=-1;

	Student(String id) {
		this.id = String.valueOf(id);
	}
	Student(String id, String name) {
			this(id);
			this.name = String.valueOf(name);
	}	
	Student(String id, String name, double grade) {
		this(id, name);
		this.grade = Double.valueOf(grade);
	}

	String getName() {
		return name;
	}
	
	String getId() {
		return id;
	}
	
	double getGrade() {
		return grade;
	}
	
	void display() {
		System.out.print("Id: "+getId()+" ");
		if(!getName().equals(null))
			System.out.print(" Name: "+getName()+" ");
		if(getGrade()>0)
			System.out.println(" Grade: "+getGrade());
	}
	
	void display(int year) {
		display();
		System.out.println(" Year: "+year);
	}
}
