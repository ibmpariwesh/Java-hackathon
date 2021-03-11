
public class InnerClassesDemo {
	public static void main(String[] args) {
		//array of 10 account object
		Account[] accounts = new Account[10];
		
	}
}

class Account{
//	private Address address;  
	private Address[] addresses;   //multiple addresses can be handled.
	private int number;
	public Account() {
		this.addresses = new Address[3];
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] addresses) { 
		this.addresses = addresses;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	private class Address{
		private String streetName;
	}
	
	
}