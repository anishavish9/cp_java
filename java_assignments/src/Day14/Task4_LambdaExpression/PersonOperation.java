package Day14.Task4_LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class PersonOperation {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Ram", 34);
		Person p2 = new Person(2, "Shyam", 50);
		Person p3 =  new Person(3, "Kartik", 17);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		System.out.println("Original list : \n"+personList);
		personList.sort(Person.ageCompare);
		System.out.println("\nAfter sorting by age\n" + personList);
		
		
	}

}
