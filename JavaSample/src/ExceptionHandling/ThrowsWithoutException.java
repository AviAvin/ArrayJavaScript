package ExceptionHandling;

import java.io.IOException;

public class ThrowsWithoutException {
	  
		 void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  
		}  
		class Testthrows3{  
		   public static void main(String args[])throws IOException
		   {    //declare exception  
			   ThrowsWithoutException m=new ThrowsWithoutException();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  }  
		}  


