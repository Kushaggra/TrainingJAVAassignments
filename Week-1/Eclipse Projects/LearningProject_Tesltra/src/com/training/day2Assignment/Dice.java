package com.training.day2Assignment;
import java.util.Random;

class Dice{
	int roll() {
		Random rand = new Random();
		return (1+rand.nextInt(5));
	}
}

