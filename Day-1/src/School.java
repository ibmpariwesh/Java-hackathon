
public class School {
	public static void main (String[] args) {
		int a =1;
//		if(a == 1) {
//			System.out.println("1");
//		}else {
//			System.out.println("not 1");;
//		}
		System.out.println(a==1? "1" :"not 1");
	}	
	
	private static void printPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	void practice() {
		for (int i = 0; i <10; i++) {
			Teacher teacher = new Teacher("Shyam"+i);
		}
		//while, do-while?
		int i=0;
		while( i<10) {
			System.out.println(i);
			i++;
		}
	}
	void studentDiscussion() {
		System.out.println("Hello");
		Student student = new Student("Ram");
		student.setAge((byte)10);
//		student.setName("      "); //avoid
//		student.name="Ram";   //avoid 
		System.out.println("Name="+student.getName());
		System.out.println(student.getAge());
		student.study();  //Ram is studying
	}
}

//data type, 
//get-set methods
//

