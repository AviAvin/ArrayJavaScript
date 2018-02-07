package polymorphism;
//Overloading concept by changing datatypes
public class  Adder1{  
	static int add(int a, int b)
	{
		return a+b;
		}  
	static double add(double a, double b)
	{
	 
		return a+b;
		}
	  
	 
	 
	public static void main(String[] args){ 
		Adder1.add(10, 12);
		Adder1.add(1.1, 1.2);
	Adder1.add(11.1, 10.2);
	  
	}}  
 