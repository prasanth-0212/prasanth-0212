package Inheritance;

class ca {
	String name;
	public void eat() {
		System.out.println("I am from New Delhi");
	}
}
class Dog extends ca {
	public void display() {
		System.out.println("My name is " + name);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dog labrador = new Dog();
		labrador.name = "Rohu";
		labrador.display();
		labrador.eat();
	}
}