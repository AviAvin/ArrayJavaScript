package polymorphism;
//Overriding
public class  Vehicle{  
	void run()
	{
		System.out.println("Vehicle is running");
		
	}  
	}  
	class Bike3 extends Vehicle{  
	void run()
	{
		System.out.println("Bike is running safely");
	}  
	  
	public static void main(String args[]){  
	Bike3 obj = new Bike3();  
	obj.run();  
	
	
	}  }