package com.ibm;

class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException {
		if (title == null) {
			throw new MyException("title is null");
		}
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}


public class Application {
	public static void main(String[] args) {
		Book book = new Book();
		try {
			book.setTitle("Ram");
		}catch(IllegalArgumentException illegalArgumentException) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("always");
		}
		System.out.println(book.toString());
//		Book book1 = new Book();
//		book1.setTitle("learning Javascript ");
//		System.out.println(book1);
	}
}