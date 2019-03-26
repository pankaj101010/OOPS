
public class DoWhileEg {
	public static void main(String[] args) {
		int i=1;
		int a=20;
		int b=19;
		int c=(a==b) ? a+b:a-b;
		//b=(a>b) ? a+b:a-b;
			System.out.println(c);
		do {
			//System.out.println(i);
			i++;
		}
		while(i<=10);
		
	}
}
