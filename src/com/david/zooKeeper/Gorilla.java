package com.david.zooKeeper;

public class Gorilla extends Mammal {
	
	public Gorilla throwSomething() {
		System.out.println("The gorilla threw a banana, energy level decreased by 5");
		this.energyLevel -= 5;
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("Thanks for the grub!, energy level increased by 10");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("Gorilla has climed the Empire State Building, energy level decreased by 10");
		this.energyLevel -= 10;
		return this;
	}
	
}
