package com.training.DiceGame;

public class Stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Ram");
		Player p2 = new Player("Krishna");
		
		
		System.out.println("Match Details:");
		System.out.println("  Player 1 - "+ p1.getName());
		p1.getD1();
		p1.getD2();
		int p1score= p1.play();
		
		System.out.println("Total Score = "+p1.getScore());
		System.out.println(" ");
		System.out.println("  Player 2 - "+ p2.getName());
		p2.getD1();
		p2.getD2();
		int p2score= p2.play();
		
		System.out.println("Total Score = "+p2.getScore());
		
		System.out.println(" ");
		if(p1.getScore()>p2.getScore())
				 {
			System.out.println("Winner is "+p1.getName()+" !!");
		}
		else if(p1.getScore()<p2.getScore()){
			System.out.println("Winner is"+ p2.getName()+" !!");
		}
		else {
			System.out.println("Its a TIE !!!");
		}
	}

}
