package com.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample1 {

	public static void main(String[] args) {
		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				
				return sqrt(a);
			}};
			
			System.out.println(formula.calculate(9));
			
			List<String> names = Arrays.asList("peter","anna","mike","joe");
			
			//before java 8 
			
			Collections.sort(names, new Comparator<String>() {

				@Override
				public int compare(String a, String b) {
					return b.compareTo(a);
				}
				
			});
			
			//with java8
			
			Collections.sort(names, (String a,String b) -> b.compareTo(a));
			
			//or
			
			Collections.sort(names, (a,b) -> b.compareTo(a));

	}

}
