
public class Student {

	String name;
	int age;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name="Divya";
		s1.age=15;
		s2.name = "Priya";
		s2.age = 15;
		System.out.println("Student name : "+s1.name);
		System.out.println("Student age : "+s1.age);
		System.out.println("Student name : "+s2.name);
		System.out.println("Student age : "+s2.age);
	}

}
