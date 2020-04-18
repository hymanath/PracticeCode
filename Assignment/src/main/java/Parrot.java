package main.java;

public class Parrot  implements Animal{
	
	public String livingWith;
	
	public Parrot(String livingWith){
		this.livingWith=livingWith;
	}
	
	public void sing(){
		
		if(livingWith.equalsIgnoreCase("dog")){
			System.out.println("A parrot living with dogs says: Woof, woof");
		}else if(livingWith.equalsIgnoreCase("cat")){
			System.out.println("A parrot living with cats says: “Meow”");
		}else if(livingWith.equalsIgnoreCase("rooster")){
			System.out.println("A parrot living near the rooster says: “Cock-a-doodle-doo”");
		}
		
		//if amything else just need to add another else if with conditions
		
	}

}
