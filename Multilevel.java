package Inheritance;

class PetAnimal {
	void eat() {
		System.out.println("eating...");
	}
}

class Cat extends PetAnimal {
	void meow() {
		System.out.println("meow...");
	}
}

class BabyCat extends Cat{
	
	void drink() {
		super.eat();
		System.out.println("Milk...");
	}
}

public class Multilevel {
	public static void main(String args[]) {
		BabyCat d = new BabyCat();
		d.meow();
		d.drink();
		d.eat();
	}
}
