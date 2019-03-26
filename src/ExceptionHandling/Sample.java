package ExceptionHandling;

public class Sample {
	public void m2() {
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[5]);
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			int lastIndex = arr.length-1;
//			System.out.println(arr[lastIndex]);
//		}
		finally {
			System.out.println("Handling exception");
			int lastIndex = arr.length - 1;
			System.out.println(arr[lastIndex]);
		}
		/*
		 * After try you should have to write either catch or finally Catch block will
		 * execute when exception occurs finally block will surely execute regardless of
		 * exception Wrap up code will be written inside finally block try and finally
		 * can be written only once while catch can be written multiple number of times
		 * try catch can also be used in nested try catch which is called as nested try
		 * catch methods
		 */
		System.out.println("Continue method m2");
	}
}
