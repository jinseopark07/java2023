package j0601;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;

	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		makeTea(coffee); 
	}

	public void makeTea(int coffee, int sugar) {
		this.coffee = coffee;
		this.sugar = sugar;
		makeTea(coffee);
	}

	public void makeTea(int coffee) {
		this.coffee = coffee;
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("---[성분]---");
		
		System.out.println("커피: "+coffee);
		System.out.println("설탕: "+sugar);
		System.out.println("크림: "+cream);
		System.out.println("----------------");
		
	}

}
