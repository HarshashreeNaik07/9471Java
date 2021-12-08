//Write a Java program to calculate the average value of array elements.

public class Ex4 {
	public static void main(String[] args) {
		int[] ex4= new int[] {06,03,04,01,98};
		int sum = 0;
		for(int i = 0; i < ex4.length ; i++)
			sum = sum + ex4[i];
		double average = sum / ex4.length;
		System.out.println("Average value of the array elements is : " +average);
	}
}
