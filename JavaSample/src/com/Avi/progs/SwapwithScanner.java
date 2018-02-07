package com.Avi.progs;

import java.util.Scanner;

public class SwapwithScanner {

	public static void main(String[] args) {
		 int x,y;
		 System.out.println(" Enter value of x and y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swap \n x="+x+" y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap \n x="+x+" y="+y);
        
	}

}
