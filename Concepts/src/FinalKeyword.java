
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child = new Child();
		child.m1();
	}
}

//class, method, variable
class Parent {
	final String name = "Pariwesh";

	void m1() {
		System.out.println("parent");
	}
	void m2() {

	}
}

class Child extends Parent {
	void m1() {// override
		System.out.println("Child");
	}

	@Override
	void m2() {

	}
}

//class MyString extends String {
//
//}