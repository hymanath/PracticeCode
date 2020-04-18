package main.java;

public class AnimalFactoryClass {

	private Animal bird;
	private Animal duck;
	private Animal chicken;
	private Animal rooster;
	private Animal parrot;
	private Animal fish;
	private Animal shark;
	private Animal clownfish;
	private Animal dolphin;
	private Animal butterfly;
	private Animal caterpillar;
	
	public AnimalFactoryClass(Animal bird,Animal duck,Animal chicken,Animal rooster,Animal parrot,Animal fish,Animal shark,Animal clownfish,Animal dolphin,Animal butterfly,Animal caterpillar){
		this.bird=bird;
		this.duck=duck;
		this.chicken=chicken;
		this.rooster=rooster;
		this.parrot=parrot;
		this.fish=fish;
		this.shark=shark;
		this.clownfish=clownfish;
		this.dolphin=dolphin;
		this.butterfly=butterfly;
		this.caterpillar=caterpillar;
	}
	
	public void getBird(){
		bird.fly();
		bird.sing();
		
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
	
	public void getFish(){
		fish.swim();
	}
	
	public void getShark(){
		shark.sizeNColor();
		shark.eat();
	}
	
	public void getClownfish(){
		clownfish.sizeNColor();
		clownfish.jokes();
	}
	public void getDolphin(){
		dolphin.swim();
	}
	
	public void getButterfly(){
		butterfly.fly();
	}
	
	public void getCaterpillar(){
		caterpillar.walk();
	}
	
}
