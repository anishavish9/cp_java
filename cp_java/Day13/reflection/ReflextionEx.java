package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Fruit {
	
	
}

class Apple extends Fruit {
	public void color() {
		System.out.println("Apple red in color");
	}
	
	public void taste() {
		System.out.println("Sweet or sour in taste");
	}
}

public class ReflextionEx {
	
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		Class c = apple.getClass();
		String name = c.getName();
		System.out.println("Name of the class : "+name);
		int modifier = c.getModifiers();
		String s = Modifier.toString(modifier);
		System.out.println("Modifier : " +s);
		Class sc = c.getSuperclass();
		System.out.println("Super class of Apple : "+sc);
		
		//get methods names
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println("Methods names: "+m.getName());
			System.out.println("Return type : "+m.getReturnType());
		}
		
	}
}

