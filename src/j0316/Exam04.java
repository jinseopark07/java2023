package j0316;

public class Exam04 {

	public static void main(String[] args) {
		String str1= new String("abc");
		String str2= new String("abc");
		//주소가 같니?
		if(str1==str2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		String str3="abc";
		String str4="abc";
		if(str3==str4) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str3="qqq";
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
