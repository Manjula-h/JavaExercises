package oopsConcept;

public class StudentsConstructorOverloadingExample {
	int id;
	String name;
	int age;
	static String college = " NCB ";
	StudentsConstructorOverloadingExample(int i, String n) {
		this.id = i;
		this.name = n;
	}

	StudentsConstructorOverloadingExample(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age + college);
	}

	public static void main(String[] args) {
		StudentsConstructorOverloadingExample sce1 = new StudentsConstructorOverloadingExample(111, "Karan",90);
		StudentsConstructorOverloadingExample sce2 = new StudentsConstructorOverloadingExample(222, "Aryan",30);
		sce1.display();
		sce2.display();
	}

}
