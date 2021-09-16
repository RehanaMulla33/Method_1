package com.xworkz.methods;

public class AC {
	public static void TurnOn() {
		System.out.println("Turn ON the AC");
	}

	public static void TurnOff() {
		System.out.println("Turn Off the AC");
	}

	public static void Temp() {
		System.out.println("Increase or decrease the temprature");
	}

	public static void main(String[] args) {

		System.out.println("AC Functions");
		AC.TurnOn();
		AC.Temp();
	}

}
