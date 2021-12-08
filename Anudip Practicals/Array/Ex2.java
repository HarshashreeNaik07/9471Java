//Write a Java program to sum values of an array.

public class Ex2 {
	public static void main(String[] args) {
		int ex2_array[]= {1,2,3,4,5};
		int sum = 0;
		for(int i : ex2_array)
			sum += i;
		System.out.println("The Sum is " +sum);
	}
}
