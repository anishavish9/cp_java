/*
 * Task 3: Reflection API
	Use reflection to inspect a class's methods, fields, and constructors, 
	and modify the access level of a private field, setting its value during runtime
 */

package Day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


class Fruit {
	private String fruitname;
	public Fruit(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	
}

class Apple extends Fruit {
	public Apple(String fruitname) {
		super(fruitname);
	}

	public void color() {
		System.out.println("Apple red in color");
	}
	
	public void taste() {
		System.out.println("Sweet or sour in taste");
	}
}

public class Task3_ReflectionAPI {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException  {
		Apple apple = new Apple("Apple");
		
		Class c = apple.getClass();
		String name = c.getName();
		System.out.println("Name of the class : "+name);
		
		//modifier
		int modifier = c.getModifiers();
		String s = Modifier.toString(modifier);
		System.out.println("Modifier : " +s);
		
		Class sc = c.getSuperclass();
		System.out.println("Super class of Apple : "+sc);
		
		// Accessing and modifying the private field `fruitname` 
		Field field = sc.getDeclaredField("fruitname"); 
		field.setAccessible(true); 
		// Making the private field accessible 
		field.set(apple, "Green Apple");
		System.out.println("Modified fruitname: " + apple.getFruitname());

			
		//constructor name
		Constructor[] constr = sc.getConstructors();
		for(Constructor co : constr) {
			System.out.println("Super class contructore name  : "+co);
		}
		
		//get methods names
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println("Methods names: "+m.getName());
			System.out.println("Return type : "+m.getReturnType());
		}
		
	}
}