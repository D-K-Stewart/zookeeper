package com.david.zooKeeper;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	
	public Bat fly() {
		System.out.println("The sound of a jet taking off, energy level decreased by 50");
		this.energyLevel -= 5;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("It's a huge Bat...Ahhhhh!, energy level increased by 25");
		this.energyLevel += 10;
		return this;
	}
	public Bat attackTown() {
		System.out.println("It's an inferno!!!, energy level decreased by 100");
		this.energyLevel -= 10;
		return this;
	
		
	}

}
