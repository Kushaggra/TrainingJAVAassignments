package com.training.interfaces;

public class Car extends Vehicle {

	private int maxSpeed;
	private String Cartype;
	
//	Constructor
	public Car(int regNo, String model, int currSpeed, int maxSpeed, String cartype) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		Cartype = cartype;
	}
	
	
	@Override
	public int increaseSpeed(int val) {
		// TODO Auto-generated method stub
		
		if(maxSpeed-currSpeed>=val) {
			this.currSpeed+=val;
			return this.currSpeed;
		}else if(maxSpeed-currSpeed<val && maxSpeed-currSpeed>0) {
			this.currSpeed+=(maxSpeed-currSpeed);
			return this.currSpeed;
		}else 
			return -1;
	}

	public int getCurrSpeed() {
		return this.currSpeed;
	}

//	Getter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	

}
