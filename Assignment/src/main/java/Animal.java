package main.java;

public interface Animal {
	
	public default void walk(){
		System.out.println("I am walking");
	}
	
	public default void fly(){
		System.out.println("I am flying");
	}

	public default void sing(){
		System.out.println("I am singing");
	}
	
	public default void swim(){
		System.out.println("I am swimming");
	}
}
