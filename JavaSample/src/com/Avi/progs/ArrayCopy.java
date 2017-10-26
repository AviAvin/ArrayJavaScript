package com.Avi.progs;

public class ArrayCopy {
	 public static void main(String[] args) {  
	        char[] a1 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        char[] a2 = new char[7];  
	  
	        System.arraycopy(a1, 2, a2, 0, 7);  
	        System.out.println(new String(a2));  
	    }  
	}  


