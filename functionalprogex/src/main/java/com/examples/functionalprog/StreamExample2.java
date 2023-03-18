package com.examples.functionalprog;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);
		
		IntStream.range(0, 4).forEach(System.out::println);
		
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i->"a"+i).forEach(System.out::println);

	}

}
