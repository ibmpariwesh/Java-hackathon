import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
//		demo1();
		bookList();

	}

	private static void bookList() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("learn Java"));
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(); // Generics
		list.add(1);
		list.add(3);
//		list.add("Ram");  //not allowed
		System.out.println("Before=" + list);
//		list.remove(1);

		System.out.println(list.contains(3));
		System.out.println("after= " + list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
