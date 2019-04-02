package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 6;
		char z = 96;
		for (int i = 1; i <= n; i++) { // For printing n lines
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			if (i % 2 != 0)
				z++;
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(i / 2 + " ");
				} else {
					System.out.print(z + " ");
				}
			}
			System.out.println();
		}
	}
}
