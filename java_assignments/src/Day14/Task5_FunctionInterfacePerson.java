package Day14;


import Day14.Task4_LambdaExpression.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;


class FunctionalInterface {

	// Predicate
	static void predicatePerson(Person person, Predicate<Person> predicate) {
		if (predicate.test(person)) {
			System.out.println(person);
		} 
	}
	
	//function
	public static void functionPerson(Person person, Function<Person, String> getInitials) {
		String initials = getInitials.apply(person);
		System.out.println("Name: " + person.getName() + ", Initials: " + initials);
	}

	// Consumer
	static void consumePerson(Person person, Consumer<Person> consumer) {
		consumer.accept(person);
		System.out.println("Updated person: " + person);
	}

	//Supplier 
	static Person createPerson(Supplier<Person> supplier) {
		return supplier.get();
	}

	

}

public class Task5_FunctionInterfacePerson {
	
	public static void main(String[] args) {
		Person p1 = new Person(1, "Ram Kumar", 33);
		Person p2 = new Person(2, "Shyam Verma", 40);
		Person p3 = new Person(3, "Lakhan Shrivas", 15);

		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		System.out.println("Original list: \n" + personList);
		
//predicate
		Predicate<Person> age = person -> person.getAge() > 18;
		System.out.println("\nPerson older then 18 are eligible to vote------->");
		personList.forEach(person -> FunctionalInterface.predicatePerson(person, age));

// Function  to fetch Name Initials 
		Function<Person, String> getInitials = person -> {
			String[] names = person.getName().split(" ");
			StringBuilder initials = new StringBuilder();
			for (String name : names) {
				if (!name.isEmpty()) {
					initials.append(name.charAt(0));
				}
			}
			return initials.toString();
		};
		System.out.println("\nBy Function with initials ----------->");
		personList.forEach(person -> {
			FunctionalInterface.functionPerson(person, getInitials);
		});

// Consumer to capitalize the person's name
		Consumer<Person> capitalizeName = person -> person.setName(person.getName().toUpperCase());
		System.out.println("\nConsumer with name to uppercase----------->");
		personList.forEach(person -> {
			FunctionalInterface.consumePerson(person, capitalizeName);
		});

// Supplier to create a person
		Supplier<Person> sp = () -> new Person(10, "jay", 10);
		System.out.println("\nSupplier----------------->");
		Person person = FunctionalInterface.createPerson(sp);
		System.out.println("Default Person created: " + person);
	}

}
