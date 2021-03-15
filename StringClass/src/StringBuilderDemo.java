
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("IBM"); // mutable
		sb.append(",Bangalore"); // IBM,Bangalore
		System.out.println(sb);
//		System.out.println(sb.charAt(3));
//		System.out.println(sb.indexOf("B")); // first occurence
//		System.out.println(sb.lastIndexOf("B")); // Last occurence
		System.out.println(sb.substring(3));

//		String str = new String("IBM,Bangalore");
//		String str1 = str;// new String("IBM,Bangalore");
//		System.out.println(str == str1);
//		System.out.println(str == sb.toString());
		
//		sb.append(str);
//		System.out.println(sb);
	}
}
