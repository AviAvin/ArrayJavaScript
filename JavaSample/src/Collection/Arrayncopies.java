package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayncopies {


 
   public static void main(String args[]) {
	   ArrayList<Integer> intlist = new ArrayList<Integer>
	   (Collections.nCopies(10, 5));
	  System.out.println("ArrayList items: "+intlist);
   }
}

