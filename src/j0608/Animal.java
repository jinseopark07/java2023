package j0608;

public class Animal {
	Animal(){
		System.out.println("동물 생성");
	}
	
}

class Dog extends Animal{
	Dog(){
		System.out.println("강아지");
	}
}

class Cat extends Animal{
	Cat(){
		System.out.println("고양이");
	}
}

class AnimalMain {
	public static void main(String []args) {
		Dog d= new Dog();
		Animal a= new Dog();
		Animal b= new Cat();
		Dog c= (Dog)new Animal();
	}
}