package icompass;

import java.util.*;
public class Operation{
	public static int sum(int a, int b, int c)	{
		return a+b+c;
}
	static int avg(int a , int b, int c) {
		return (a+b+c)/3;
	}
	static void min(int a, int b, int c) {
		if(a < b && a < c) {
			System.out.println("Min is" +a);
		}
		if(b < a && b < c) {
			System.out.println("Min is" +b);
		}
		if(c < a && b > c) {
			System.out.println("Min is" +c);
		}
	}
	
	static void max(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println("Max is" +a);
		}
		if(b > a && b > c) {
			System.out.println("Max is" +b);
		}
		if(c > a && c >b) {
			System.out.println("Max is" +c);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Sum is: " + sum(a,b,c));
		System.out.println("Avg is: " + avg(a,b,c));
		
		min(a,b,c);
		max(a,b,c);
		
		sc.close();
	}
	
}
