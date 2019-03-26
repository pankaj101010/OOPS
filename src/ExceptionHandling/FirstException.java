package ExceptionHandling;

import java.io.FileInputStream;

public class FirstException {
	public static void main(String[] args) {
		int[] test = { 1, 2, 3, 4, 5 };
		/*
		 * System.out.println(test[5]+" is the fifth element "); This is unchecked
		 * exception
		 */
		/*
		 * FileInputStream fis = new
		 * FileInputStream("/home/shashank/Desktop/Offer Letter.pdf"); This is a checked
		 * exception. Exceptions are completely handled by compiler and they are objects
		 */
		/* try and catch has to be used together only */

		Test t = new Test();
		t.m1();

		System.out.println("Continue main m");

	}
}
