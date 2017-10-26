package com.Avi.progs;

public class Bike   //Constructor_parameterised 
{
	int model;
	String Name;
	
	Bike(int m,String n)    //Creation of constructors
	{
		
		 model=m;
		 Name=n;
	}
	
	public void disp()
	{
		System.out.println(model+" "+Name);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Bike b1=new Bike(122,"Pulser");       //parameterised constructor
		Bike b2=new Bike(111,"Apache");
		 b1.disp();
		 b2.disp();

	}

}
