package useOffinal;

final class Car {

	
	void run(){
		System.out.println("Running nice");
	}
	
	public class Motor extends Car
	{
		
		void run1()
		{
			System.out.println("Running very nice");
		}
		
		
		
	}
	 public static void main(String args[]){  
		 
		 Car c=new Car();
		 c.run();
		 //c.run1();
	 }
}
