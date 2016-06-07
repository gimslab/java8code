package ch3.sec09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestOld {

	public static void main(String[] args) {

		Collection<String> words = makeCollection();

		String[] result = words.toArray(new String[words.size()]);
		for (String each : result)
			System.out.println(each);
	}

	private static Collection<String> makeCollection() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("aaa");
		list.add("bbbj");
		list.add("dddd");
		return list;
	}
}
