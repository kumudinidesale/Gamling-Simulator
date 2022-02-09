package com.java;
import java.util.Scanner;
public class GamblingSimulator {

	public static void main(String[] args) {
	System.out.println("Welcome to gambling simulator");
	int stake =100;
	int bet =1;
     int GAME =(int) Math.floor(Math.random() * 2);
     if (GAME == 0) {
    	 stake++;
     System.out.println("Gambler won the game ");
     System.out.println("Gambler having stake after bet $ " +stake);
     }
	else {
		stake--;
		System.out.println("Gambler lose the game");
	     System.out.println("Gambler having stake after bet $ " +stake);
	}
}
}
