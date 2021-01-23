package oopsConcept;

public class Student {
	int id;
	String name;
	int rollno;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	public void displayInformation() {
		System.out.println(rollno + " " + name);

	}

}
