package j0420;

public class ����2 {

	
	public static void main(String[] args) {
		System.out.println("N1");
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N2");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N3");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N4");
		for(int i=3; i>=1;i-- ) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N5");
		for(int i=3; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N6");
		for(int i=1; i<=3; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
