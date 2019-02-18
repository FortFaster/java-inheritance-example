package com.example;

class Athlete extends Person {

	String sport;

	public Athlete(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void playSport() {
		System.out.println(name + " is playing " + sport + ".");
	}
	
	@Override
	public void intorduce() {
		super.intorduce();
		System.out.println("I'm an athlete");
	}
}

