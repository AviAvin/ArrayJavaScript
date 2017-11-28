package com.Avi.progs;

//Static method

public class ChangeStaticVar {

	
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change()
	     {  
	     college = "BBDIT";  
	     }  
	  
	     ChangeStaticVar(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){
	    	 System.out.println(rollno+" "+name+" "+college);
	    	 }  
	  
	    public static void main(String args[]){  
	    	ChangeStaticVar.change();  
	  
	    	ChangeStaticVar s1 = new ChangeStaticVar (111,"Karan");  
	    	ChangeStaticVar s2 = new ChangeStaticVar (222,"Aryan");  
	    	ChangeStaticVar s3 = new ChangeStaticVar (333,"Sonoo");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

