package com.example;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		Artist art = new Artist("Fort", 27);
		Athlete ath = new Athlete("Pin", 26);
		
		
		art.genre = "Guitart";
		ath.sport = "Soccer";
		
		
		art.intorduce();
		art.playMusic();
		
		System.out.println();
		
		
		ath.intorduce();
		ath.playSport();
	}

}



