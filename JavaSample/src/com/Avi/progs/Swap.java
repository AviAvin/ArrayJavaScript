package com.Avi.progs;

public class Swap {
	
	public static void main(String[] args) {
		int a=10;
		int b=20; 
		System.out.println("Numbers before swap: "+a+" ,"+b);
		
		 a=a+b;
	     b=a-b;		
		 a=a-b;
		
		
	System.out.println("Numbers after swap:" +a+" ,"+b);	
	
	
	}

}
