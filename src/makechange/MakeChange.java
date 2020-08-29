package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int price, cashGiven, cashBack;
		int twenties;
		int tens;
		int fives;
		int ones;
		int quarters;
		int dimes;
		int nickles;
		int pennies;

		System.out.print("Please enter the price of your item: ");
		price = (int) Math.round(input.nextDouble() * 100);

		System.out.print("Please enter the amount of cash you are paying with: ");
		cashGiven = (int) Math.round(input.nextDouble() * 100);

		if (cashGiven == price) {
			System.out.println("No change. Have a great day!");
		} 
			else if (cashGiven < price) {
			System.out.println("Not enough money to cover this transaction.");
		
			}
			else if (cashGiven > price) {
			System.out.println("Change Owed: $" + (cashGiven - price) / 100.00);
			cashBack = cashGiven - price;
			twenties = cashBack / 2000;

			if (twenties > 0) {
				cashBack = cashBack % 2000;
				System.out.println("Twenties : " + twenties);
			}

			tens = cashBack / 1000;
			
			if (tens > 0) {
				cashBack = cashBack % 1000;
				System.out.println("Tens     : " + tens);
			}

			fives = cashBack / 500;
			
			if (fives > 0) {
				cashBack = cashBack % 500;
				System.out.println("Fives    : " + fives);
			}

			ones = cashBack / 100;
			
			if (ones > 0) {
				cashBack = cashBack % 100;
				System.out.println("Ones     : " + ones);
			}

			quarters = cashBack / 25;
			
			if (quarters > 0) {
				cashBack = cashBack % 25;
				System.out.println("Quarters : " + quarters);
			}

			dimes = cashBack / 10;
			
			if (dimes > 0) {
				cashBack = cashBack % 10;
				System.out.println("Dimes    : " + dimes);
			}

			nickles = cashBack / 5;
			
			if (nickles > 0) {
				cashBack = cashBack % 5;
				System.out.println("Nickles  : " + nickles);
			}
			pennies = cashBack;
			
			if (pennies > 0) {
				cashBack = cashBack % 1;
				System.out.println("Pennies  : " + pennies);
			}
input.close();
		}
	}
}
