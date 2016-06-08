package ch3.sec09;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FuncGenTest {

	public static void main(String[] args) {

		Stream.of("a", "bb", "ccc").forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		Stream.of(1, 2, 3, 999).forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		Stream.of(new Employee("a"), new Employee("b")).forEach(new Consumer<SuperPerson>() {
			@Override
			public void accept(SuperPerson t) {
			}
		});
		Stream.of(new Employee("a"), new Employee("b")).forEach(new Consumer<Person>() {
			@Override
			public void accept(Person t) {
			}
		});

		Stream<String> filtered1 = Stream.of("a", "bb", "ccc").filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.equals("bb");
			}
		});

		Stream<Integer> filtered2 = Stream.of(1, 2, 3, 999).filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t.compareTo(100) < 0;
			}
		});

		Stream<Employee> filtered3 = Stream.of(new Employee("a"), new Employee("b")).filter(new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return true;
			}
		});
	}

}