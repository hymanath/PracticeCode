package main.java;

public class MainClass {
	
	public static void main(String args[]){
		Duck d = new Duck();
		Chicken c = new Chicken();
		Rooster r = new Rooster();
		Parrot p = new Parrot("dog");
		
		AnimalFactoryClass a = new AnimalFactoryClass(d,c,r,p);
		
		a.getParrot();
	}

}
