package operations;
import java.util.Scanner;
public class arithop implements calculation {
	double sum;
	Scanner obj1=new Scanner(System.in);
	public void addition() {
		int l,b;
		System.out.println("Enter first number");
		l=obj1.nextInt();
		System.out.println("Enter second number");
		b=obj1.nextInt();
		sum=l+b;
		System.out.println("sum:"+sum+"\n");
	
	}
	public void multiplication() {
		int h,b;
		int mul;
		System.out.println("Enter first number:");
		b=obj1.nextInt();
		System.out.println("Enter second number");
		h=obj1.nextInt();
		mul=h*b;
		System.out.println("result=:"+mul+"\n");
	}
	public void subtraction() {
		float r,z,sub;
		System.out.println("first number:");
		r=obj1.nextInt();
		System.out.println("second number:");
		z=obj1.nextInt()…