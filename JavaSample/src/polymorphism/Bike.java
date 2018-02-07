package polymorphism;

public class Bike {

	void run()
	{
		System.out.println("running");
	}
	
	public class Splender extends Bike{
		void run()
		{
			System.out.println("runnig safely with 60km");
		}
	}
	public static void main(String[] args) {
		 
		Bike b = new Bike();
				b.run();
		
	}

}
