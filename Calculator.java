package week3.day1assignment;

public class Calculator {
	public void add(int a, int b) {
		System.out.println("The addition of 2 numbers is " + (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("The addition of 3 numbers is :" + (a+b+c));
	}
	
	public void multiply(int a, int b) {
		System.out.println(" The multiply of 2 numbers are : " + (a*b));
	}
	
	public void multiply(int a , double b, double c)
	{
		System.out.println(" The multiply of 3 numbers are :" + (a*b*c));
	}
	
	public void subtract(int a, int b) {
		System.out.println("The subtraction of 2 numbers are :" + (a-b));
	}
	
	public void subtract(int a, double b, double c) {
		System.out.println(" The subtraction of 3 numbers are :" + (a-b-c));
	}
	
	public void divide(int a, int b) {
		System.out.println("The divide numbers are :" + (a/b));
	}
	
	public void divide(double a, int b) {
		System.out.println(" The divide numbers are: " + (a/b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calObj = new Calculator();
		calObj.add(10, 5);
		calObj.add(23, 50, 78);
		calObj.multiply(23, 45);
		calObj.multiply(10, 3.4, 5.5);
		calObj.subtract(7, 5);
		calObj.subtract(10, 1.2, 2.5);
		calObj.divide(40, 2);
		calObj.divide(4.5, 5);

	}

}
