package dataConversion;

public class Human {
	private String name; // Data encapsulation
	private byte age; // in years
	private GENDER gender = GENDER.FEMALE;

	public GENDER getGender() {
		return gender;
	}
	 void eat() {
		System.out.println("Human eats");
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null | name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
}
