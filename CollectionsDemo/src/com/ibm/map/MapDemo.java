package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {

	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String , Book> books= new HashMap<String, Book>();
		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {
			Book book1 = new Book("java"+i);
			books.put("book"+i, book1);
			
		}
//		books.clear();
//		books.remove("book2");
//		books.containsKey(key)
		System.out.println(books.size());// Entry= key+value
	}
}
