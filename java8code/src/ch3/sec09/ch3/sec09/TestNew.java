package ch3.sec09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

class TestNew {
	
	public static void main(String[] args) {
		
		Stream<String> words = makeStream();
		//		String[] result = words.toArray(String[]::new);

		IntFunction<String[]> func = new IntFunction<String[]>() {
			@Override
			public String[] apply(int value) {
				return new String[value];
			}
		};

		String[] result = words.toArray(func);
		for(String each:result)
			System.out.println(each);
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