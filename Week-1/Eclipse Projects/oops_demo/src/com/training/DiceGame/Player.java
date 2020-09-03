package com.training.DiceGame;

class Player{
	private String name;
	private Dice d1,d2;
	private int roll1,roll2;
	private int score;
	
//	Constructor
	public Player(String name) {
		super();
		this.name = name;
		d1 = new Dice();
		d2 = new Dice();
	}

	
//	Get each roll value
	public int getD1() {
		roll1 = d1.roll();
		System.out.println("	Roll 1 = "+ roll1);
		return roll1;
	}

	public int getD2() {
		roll2 = d2.roll();
		System.out.println("	Roll 2 = "+ roll2);
		return roll2;
	}
	
//	Getter
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	

	//	User Defined function
	public int play() {
		this.score = roll1+roll2;
//		System.out.println(score);
		return this.score;
	}


	
	
}

