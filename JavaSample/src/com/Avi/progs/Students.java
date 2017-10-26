package com.Avi.progs;

public  class Students {
	int rollno;
	String name;
	//Object creation through method//
	 public void insert (int r,String n) {
	 
		rollno=r;
		name=n;
	}
	
	public void disp(){
		System.out.println(rollno+" "+name);
	}
    public static class Test{
    	
    	
	public static void main(String[] args) 
	{
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		s1.insert(10, "karan");
		s2.insert(20,"avi");
		s3.insert(32, "Santosh");
		s1.disp();
		s2.disp();
		s3.disp();
		
	}
		 

	}

}
