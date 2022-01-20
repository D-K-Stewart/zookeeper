package com.david.zooKeeper;

public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return this.energyLevel;
	}
}
