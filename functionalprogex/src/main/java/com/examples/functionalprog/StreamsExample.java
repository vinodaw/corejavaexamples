package com.examples.functionalprog;
import java.util.List;
import java.util.ArrayList;


public class StreamsExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("vinod");
		list.add("vivek");
		list.add("mukesh");
		list.add("vishwas");
		list.add("sachin");list.add("habib");
		list.add("pavan");
		list.add("rama");
		list.add("dinesh");
		list.add("naresh");

		for(String name : list) {
			if(name.startsWith("v"))
			System.out.println("Name:"+name);
		}
		
		list.stream().filter(name -> name.startsWith("v")).forEach(System.out::println);
	}

}
