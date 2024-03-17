package com.guvi.task5.streammap;
//import below commented packages if you are using arrays and list
//import java.util.Arrays;
//import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamMap {
    public static void main(String[] args) {
	    
	 //used map() to convert list of strings to UpperCase
		
	    Stream<String> names=Stream.of("aBc","d","ef");
	    System.out.println(names.map(s->{
	     return s.toUpperCase(); })
	    .collect(Collectors.toList()));
	 
	 /*Another approach to convert list of strings to UpperCase using arrays,list and stream
	    
     	List<String> names=Arrays.asList("aBc","d","ef");
		System.out.println(names);
	    List<String>uppercase=names.stream()
				    .map(String::toUpperCase)
				    .collect(Collectors.toList());
	    System.out.println(uppercase);
	*/
	}
}

/*
Output:
 
 [ABC, D, EF]
*/