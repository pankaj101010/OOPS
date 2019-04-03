package Patterns;

import java.util.Scanner;

public class KajuKatli {
	private static Scanner inp;
		//This file works according to user input and forces user to enter only odd input as kaju katli can be made by only odd inputs.
	public static void main(String[] args) {
		inp = new Scanner(System.in);
		System.out.println("Please enter a odd number of your choice to design kaju Katli");
		int n = inp.nextInt();
		while (true) {
			if (n % 2 == 0) {
				System.err.println("Please enter an odd number only");
				n = inp.nextInt();
			} else {
				break;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (i <= (n / 2 + 1)) {
				for (int s = 1; s <= (n - i); s++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("$ ");
				}
			} else {
				for (int s = 1; s <= i - 1; s++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n - i + 1; j++) {
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
}
