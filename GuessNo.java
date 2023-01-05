package com.besant.guessno;

import java.util.Scanner;

public class GuessNo {
	
	public void guessNo() {
		Scanner scan=new Scanner(System.in);
		
		int number=(int) (100 * Math.random());
		System.out.println(number);
		
		int totalAttempts=5;
		int guessedNo = 0;
		System.out.println("Welcome to the guess number Game \nyou have 5 attempts to guess a number between 1 to 100");
		
		for(int i=0;i<totalAttempts;i++) {
			System.out.println("Guess the number");
			guessedNo=scan.nextInt();
			
			if(guessedNo < number) {
				System.out.println("the entered number is lesser than the number");
			}
			
			else if(guessedNo > number) {
				System.out.println("the entered number is greater than the number");
			}
			
			else if(guessedNo == number) {
				System.out.println("Congratualations you won the game");
				break;
			}	
		}
		if(guessedNo != number) {
			System.out.println("Game Lost the number is "+number);
		}
		scan.close();
	}
}
