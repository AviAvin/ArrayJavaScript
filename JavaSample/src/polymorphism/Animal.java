package polymorphism;
//Super to refer imideate parent class variable
public class Animal {
	String color="white";  
	 
	class Dog extends Animal
	{  
	String color="black";  
	void printColor()
	{  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}  
	 
	}
	public void main(String[] args) {
		Dog d=new Dog();  
		d.printColor();  
		
		
		}
	}
// o/p
	//black
	//white
	//