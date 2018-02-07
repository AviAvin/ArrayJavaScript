package Collection;

import java.util.ArrayList;

public class InitializationExample2 {
			   public static void main(String args[]) {
				   ArrayList<String> cities = new ArrayList<String>(){{
					   add("Delhi");
					   add("Agra");
					   add("Chennai");
					   }};
				  System.out.println("Content of Array list cities:"+cities);
			   }
			}

	


