package useOffinal;
//  Final method cannt override

public class Finalmethod {
	
	final void run(){
		
		System.out.println("Runs slow");
	}
 
	 void run(){
		 
			System.out.println("Runs fast");
	}
	public static void main(String[] args) {
		
		Finalmethod obj=new Finalmethod();
		 obj.run();
	}

}
