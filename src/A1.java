
public class A1 {
	public int a1i=10;
	static int x=30;
	public static void main(String[] args) {
		A1 a1=new A1();
		A1 a2=new A1();
		a1.x=a1.x+5;
		a2.x=a1.x+5;
		System.out.println(a1.x);
	}
}
