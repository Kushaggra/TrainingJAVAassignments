package com.training.interfaces;

public class LongDrive {

	public static void main(String[] args) {
		Car car= new Car(20200825, "Honda CIVIC", 125, 200, "Sedan");
		System.out.println(car.start());
		System.out.println(car.currSpeed);
		int SpeedOut=car.increaseSpeed(90);
		
		if(SpeedOut!=-1) {
			System.out.print(car.currSpeed);
			if(SpeedOut==car.getMaxSpeed()) {
				System.out.println(" - Vehicle at it's max speed, lower the speed!");
			}
		}else {
			System.out.println("Max Speed Limit Reached,\nPlease decrease the Speed");
		}
		
		System.out.println(car.stop());
		

	}

}
