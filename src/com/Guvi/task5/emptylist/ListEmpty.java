package com.guvi.task5.emptylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEmpty {
	public static void main(String[] args) {
		
			 List<String> Liststrings =new ArrayList<String>(Arrays.asList("abc","","bc","efg","abcd","","jkl"));
			 System.out.println("Strings in the List are :"+Liststrings);
			 List<String> newstrings = new java.util.ArrayList<>();
			        // Iterate over the list and add non-empty strings to the new list
			        for (String str : Liststrings) {
			            if (!str.isEmpty()) {
			                newstrings.add(str);
			            }
			        }
			        // Print the list of non-empty strings
			        System.out.println("Non Empty Strings in the List are :"+newstrings);
     }
	
}
 
	/*Another approach to remove empty strings and to print non empty strings using removeAll() method
	

	   List<String> Liststrings =new ArrayList<String>(Arrays.asList("abc","","bc","efg","abcd","","jkl"));
       Liststrings.removeAll(Arrays.asList(""));
       System.out.println(Liststrings);
     }*/

/*
Output:

Strings in the List are :[abc, , bc, efg, abcd, , jkl]
Non Empty Strings in the List are :[abc, bc, efg, abcd, jkl]

*/