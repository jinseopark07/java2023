package j0323;

public class Exam04 {

	public static void main(String[] args) {
		int a[]= new int[3];
		int []b= new int[5];
		int c[]= {1,2,3,4,5,6};
		int d[]= new int[] {7,8,9};
		// a.length=10;
		
		System.out.println(d.length);
		
		for(int i=0; i<a.length; i++) {
		System.out.println("a["+i+"] = "+a[i]);
		

		}
		String[] str= new String[3];
		str[0]="Hello";
		str[1]="java";
		str[2]="World";
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
				
	}

}
