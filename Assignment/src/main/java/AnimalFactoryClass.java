package main.java;

public class AnimalFactoryClass {

	private Animal duck;
	private Animal chicken;
	private Animal rooster;
	private Animal parrot;
	
	public AnimalFactoryClass(Animal duck,Animal chicken,Animal rooster,Animal parrot){
		this.duck=duck;
		this.chicken=chicken;
		this.rooster=rooster;
		this.parrot=parrot;
	}
	
	public void getDuck(){
		duck.sing();
		duck.swim();
	}
	
	public void getChicken(){
		chicken.sing();
	}
	
	public void getRooster(){
		rooster.sing();
	}
	
	public void getParrot(){
		parrot.sing();
	}
}
