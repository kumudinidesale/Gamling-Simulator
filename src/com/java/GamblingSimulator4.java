package com.java;

import java.util.Random;

public class GamblingSimulator4 {
	public static final int STAKE = 100;// STAKE per day
	public static final int BET = 1;
	public static final int WIN = 1;
	public static int stake = 0;// gambler bets with 1

	/*
	 * will check if gambler wins or loss
	 */

	public static void winCheck() {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == WIN) {
			stake++;// incrementing
		} else {
			stake--;// decrementing
		}

	}
	/*
	 * As a Calculative Gambler if won or lost 50% of the stake, would resign for
	 * the day
	 */

	public static void resignDayCheck() {
		int totalStake = 0;
		stake = 0;
		while (stake != 50 && stake != -50) {
			winCheck();
		}
		totalStake = stake + STAKE;
		System.out.println("Total stake for resign for a day is  " + totalStake);
	}

	public static void monthlyWinOrLossCheck() {
		int day;
		for (day = 1; day <= 20; day++) {
			System.out.printf("day %d\n", day);
			resignDayCheck();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		monthlyWinOrLossCheck();
	}
}
