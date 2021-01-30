package javaControlFlow2TTSHW;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String userResponse2;// declared variable userResponse2 outside of loop
		
		System.out.println("Numbers:");// print the valid numbers from AsciiChar file
		AsciiCharsJCF.printNumbers();

		System.out.println("Lowercase letters:");
		AsciiCharsJCF.printLowerCase();// print the valid letters from AsciiChar file
		
		System.out.println("Uppercase letters:");
		AsciiCharsJCF.printUpperCase();// print the valid letters from AsciiChar file

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");//request and capture user name
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");// determine if program ends or continues
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			
			userInput.close();
			System.exit(0);
		}
		
		do {
			
			System.out.println("What is the name of your favorite pet? (Seabiscuit, Jaws, etc.)");// request information to convert to lottery numbers
			String favPet = userInput.nextLine();
			char asciiFavPetC = favPet.charAt(2);
			int asciiFavPet = asciiFavPetC;//Convert 3rd letter of pet name to integer
			//System.out.println(asciiFavPet);// test print of convert to ascii
			
			System.out.println("What is the age of your favorite pet? (7, 12, etc.)");
			String ageFavPet = userInput.nextLine();
			int ageFavPet1 = Integer.parseInt(ageFavPet);
			
			System.out.println("What is your lucky or favorite number? (7, 12, etc.)");
			String luckyNumb = userInput.nextLine();
			int luckyNumb1 = Integer.parseInt(luckyNumb);
			
			System.out.println("What is the two-digit model year of your car? (09, 17)");
			String carYear = userInput.nextLine();
			int carYear1 = Integer.parseInt(carYear);
			
			System.out.println("What is the name of your favorite actor/actress?");
			String favActor = userInput.nextLine();
			char asciiFavActorA = favActor.charAt(0);
			int asciiFavActor = asciiFavActorA;//Convert first letter of actor name to integer
			//System.out.println(asciiFavActor);// test print of convert to ascii
			
			System.out.println("Pick a random number between 1 and 50 (7, 12, etc.)");
			String randoNum = userInput.nextLine();
			int randoNum1 = Integer.parseInt(randoNum);
			
		
			Random random = new Random();// generate three random numbers
			int randOne = 0;
			while (true) {
				randOne = random.nextInt(76);
				if(randOne !=0) break;
			}
			int randTwo = 0;
			while (true) {
				randTwo = random.nextInt(49);
				if(randTwo !=0) break;
			}
			int randThree = 0;
			while (true) {
				randThree = random.nextInt(66);
				if(randThree !=0) break;
			}
			int magBall = (luckyNumb1 * randOne);// generate Magic ball
			while (magBall > 75) {
				magBall = (magBall - 75);
			}
			int lottNumbOne = asciiFavPet;// generate lottery number one
			while (lottNumbOne > 65) {
				lottNumbOne = (lottNumbOne - 65);
			}
			int lottNumbTwo = (carYear1 + luckyNumb1);// generate lottery number two
			while (lottNumbTwo > 65) {
				lottNumbTwo = (lottNumbTwo - 65);
			}
			int lottNumbThree = (randoNum1 - randTwo);// generate lottery number three
			if (lottNumbThree < 0) {
				lottNumbThree = (lottNumbThree + randTwo);
			}
			int lottNumbFour = asciiFavActor;// generate lottery number four
			while (lottNumbFour > 65) {
				lottNumbFour = (lottNumbFour - 65);
			}
			int lottNumbFive = (ageFavPet1 + carYear1);// generate lottery number five
			while (lottNumbFive > 65) {
				lottNumbFive = (lottNumbFive - 65);
			}
		
			System.out.printf("Lottery Numbers: %s, %s, %s, %s, %s  Magic ball: %s\n", lottNumbOne, lottNumbTwo, lottNumbThree, lottNumbFour, lottNumbFive, magBall);
			
			System.out.println("Would you like to answer the questions again to generate another set of numbers? (y/n)");// repeat process or exit
			userResponse2 = userInput.nextLine();
			
		} while (userResponse2.equalsIgnoreCase("y") || userResponse2.equalsIgnoreCase("yes"));
			
			if (userResponse2.equalsIgnoreCase("n") || userResponse2.equalsIgnoreCase("no")) {
				System.out.printf("Okay %s, thank you for playing.\n", inputName);
		}
			
		userInput.close();
	}

}
