package com.training.q3_hospital;

public class Baby {

	private int height;
	private int weight;
	
//	Constructor
	public Baby(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

//	Getters
	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

//	toString
	@Override
	public String toString() {
		return "Baby [height=" + height + ", weight=" + weight + "]";
	}
	
}
