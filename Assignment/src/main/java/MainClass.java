package main.java;

public class MainClass {
	
	public static void main(String args[]){
		
		Bird bird =new Bird();
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		Rooster rooster = new Rooster();
		Parrot parrot = new Parrot("dog");
		Fish fish = new Fish();
		Shark shark = new Shark();
		Clownfish clownfish = new Clownfish();
		Dolphin  dolphin = new Dolphin();
		Butterfly butterfly =new Butterfly();
		Caterpillar caterpillar = new Caterpillar();
		
		
		AnimalFactoryClass a = new AnimalFactoryClass(bird,duck,chicken,rooster,parrot,fish,shark,clownfish,dolphin,butterfly,caterpillar);
		
		a.getBird();
		a.getDuck();
		a.getChicken();
		a.getRooster();
		a.getParrot();
		a.getFish();
		a.getShark();
		a.getClownfish();
		a.getDolphin();
		a.getButterfly();
		a.getCaterpillar();
	}

}
