
package com.java;

import java.util.Random;

public class GamblingSimulator3 {
	public static final int STAKE = 100;// STAKE per day
	public static final int BET = 1;
	public static final int WIN = 1;
	public static int stake = 0;// gambler bets with 1

	/*
	 * function will check if gambler wins or loss
	 */

	public static void winCheck() {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == WIN) {
			stake++;// incrementing
		} else {
			stake--;// decrementing
		}
		System.out.println("stake = " + stake);

	}

	public static void resignDayCheck() {
		int totalStake = 0;
		while (stake != 50 && stake != -50) {
			winCheck();
		}
		totalStake = stake + STAKE;
		System.out.println("Total stake for resign for a day is  " + totalStake);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		resignDayCheck();
	}
}
