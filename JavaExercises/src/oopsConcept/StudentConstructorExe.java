package oopsConcept;

public class StudentConstructorExe {
	int id;
	String name;

	StudentConstructorExe(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		StudentConstructorExe sce1 = new StudentConstructorExe(111, "Karan");
		StudentConstructorExe sce2 = new StudentConstructorExe(222, "Aryan");
		sce1.display();
		sce2.display();
	}

}
