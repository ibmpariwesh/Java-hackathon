import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int a=1;
//		a.
		Integer b=a;  //autoboxing
//		b.
		Float f = 45.78F; 
		
		Double d = 23.4;
		System.out.println(d.compareTo(33.3));
		double primitiveDouble = d;//auto unboxing
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(56);
	}
}
