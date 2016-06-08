package ch3.sec09;

import java.util.ArrayList;
import java.util.List;

public class GenTest {
	public static void main(String[] args) {
		List<SuperPerson> superPersons = new ArrayList<>();
		List<Person> persons = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		List<Employee> employees = list;
		List<SubEmployee> subEmployees = new ArrayList<>();

//		readFrom(superPersons);
//		readFrom(persons);
//		readFrom(employees);
//		readFrom(subEmployees);

//		writeTo(superPersons);
//		writeTo(persons);
//		writeTo(employees);
//		writeTo(subEmployees);
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