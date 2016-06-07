package ch3.sec09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Test {
	
	public static void main(String[] args) {
		
		Stream<String> words = makeStream();
		String[] result = words.toArray(String[]::new);
		
		System.out.println(result.length);
	}

	private static Stream<String> makeStream() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("aaa");
		list.add("bbbj");
		list.add("dddd");
		return list.stream();
	}
}