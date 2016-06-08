package ch3.sec09;

import java.util.ArrayList;
import java.util.List;

public class GenTest {
	public static void main(String[] args) {
		//		List<Person> tenants = staff;
		List<Employee> staff = makeEmployees();
		List<Person> persons = makePersons();

		readFrom(staff);
		readFrom(persons);

		writeTo(staff);
		writeTo(persons);
	}

	private static void readFrom(List<? extends Person> list) {

//		Object o = list.get(0);
//		SuperPerson sp = list.get(0);
//		Person p = list.get(0);
//		Employee e = list.get(0);
//		SubEmployee se = list.get(0);
//		list.add(new SuperPerson("bok"));
//		list.add(new Person("bok"));
//		list.add(new Employee("bok"));
//		list.add(new SubEmployee("hi"));
	}

	private static void writeTo(List<? super Employee> list) {

//		Object o = list.get(0);
//		SuperPerson sp = list.get(0);
//		Person p = list.get(0);
//		Employee e = list.get(0);
//		SubEmployee se = list.get(0);
//		list.add(new SuperPerson("bok"));
//		list.add(new Person("bok"));
//		list.add(new Employee("bok"));
//		list.add(new SubEmployee("hi"));
	}

	private static List<Employee> makeEmployees() {
		List<Employee> list = new ArrayList<>();
		return list;
	}

	private static List<Person> makePersons() {
		return null;
	}
}

class SuperPerson{
	public SuperPerson(String string) {
	}
}
class Person extends SuperPerson {
	public Person(String string) {
		super(string);
	}
}

class Employee extends Person {
	public Employee(String string) {
		super(string);
	}
}

class SubEmployee extends Employee{
	public SubEmployee(String string) {
		super(string);
	}
}