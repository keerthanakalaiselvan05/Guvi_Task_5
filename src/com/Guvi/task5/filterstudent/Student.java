package com.guvi.task5.filterstudent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		//list interface to store 10 student names
		List<String> names =new ArrayList<>();
		names.add("Asha");
		names.add("Keerthana");
		names.add("Aaradhiya");
		names.add("Kishore");
		names.add("Bubloo");
		names.add("Aswin");
		names.add("Siva");
		names.add("Kalai");
		names.add("Aadhithiri");
		names.add("Rolex");
		List<String>newlist=names.stream()//stream API 
				             .filter(n->n.startsWith("A"))//lambda expression to filter students
				             .collect(Collectors.toList());
				             
	    System.out.println("Students with special gifts : "+newlist);
	}
}

/*
Output:

Students with special gifts : [Asha, Aaradhiya, Aswin, Aadhithiri]
*/