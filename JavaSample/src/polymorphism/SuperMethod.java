package polymorphism;

public class SuperMethod 
{
void eat()
{
	System.out.println("eating");
}}
	class Dog extends SuperMethod{
		void eat(){
			System.out.println("Dog eating");
		}
		void bark(){
			super.eat();
		}
	}
	class Test{
		
	
	public static void main(String[] args) {
		 Dog d=new Dog();
		 d.eat();
		 d.bark();
		 
	}
	}


