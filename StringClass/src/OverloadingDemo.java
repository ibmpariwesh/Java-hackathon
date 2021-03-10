import java.util.logging.Logger;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
//		s1.study(1);
	}
}

class School{
	Student[] students = new Student[10]; //composition
}
//same method name, different number and type of arguments, access coud be anything
class Student1{
	public  void study(int duration, String subject) {
		System.out.println("study.. for "+duration+" hour. "+subject);
		study(duration);
	}
	private  void study(int duration) {
		System.out.println("study.. for "+duration+" hour");
	}
	public  void study() {
		System.out.println("study..");
	}
}
//UML = Unified modelling language
