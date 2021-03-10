package dataConversion;

public class School {
	public static void main(String[] args) {
//		Student s1 = new Human();
		Human s1 = new Student("Ram");
//		s1.eat();
		((Student)s1).eat();
	}
}
