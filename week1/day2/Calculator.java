package week1.day2;

public class Calculator {
	public int add(int n1,int n2,int n3) {
			return n1+n2+n3;
	}
	public int mul(int n4,int n5) {
		return n4*n5;
		
	}
	public void sub() {
		int a=10;
		int b=5;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.mul(15,10));
		}

}
