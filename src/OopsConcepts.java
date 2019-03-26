
public class OopsConcepts {
	private int a=5;
	private int b=7;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void display() {
		System.out.println(a+"\t"+b);
	}
	public static void main(String[] args) {
		OopsConcepts A=new OopsConcepts();
		A.display();
	}
	
}
