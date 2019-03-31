
public class Student {

	String name;
	int age;
	
	public void display()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student age: "+age);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name="Divya";
		s1.age=15;
		s2.name="Priya";
		s2.age=14;
		s1.display();
		s2.display();
	}

}
