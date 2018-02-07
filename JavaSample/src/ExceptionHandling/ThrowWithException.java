package ExceptionHandling;

import java.io.IOException;

public class ThrowWithException {

	 void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		}  
		class Testthrows4{  
		   public static void main(String args[])throws IOException{//declare exception  
			   ThrowWithException m=new ThrowWithException();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  }  
		}

