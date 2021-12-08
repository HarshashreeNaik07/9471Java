//Write a Java program to find the maximum and minimum value of an array.

import java.util.*;
public class Ex10 {
	
	static int max;
	static int min;

	public static void max_min(int Ex10[]) {
		max = Ex10[0];
		min = Ex10[0];
		int len = Ex10.length;
		for(int i = 1; i < len - 1; i = i+2)
		{
			if(i + 1 > len)
			{
				if(Ex10[i] > max) max = Ex10[i];
				if(Ex10[i] < min) min = Ex10[i];
			}
			if(Ex10[i] > Ex10[i+1])
			{
				if(Ex10[i] > max) max = Ex10[i];
				if(Ex10[i + 1] < min) min = Ex10[i + 1];
			}
			if(Ex10[i] < Ex10[i+1])
			{
				if(Ex10[i] < min) min = Ex10[i];
				if(Ex10[i+1] > max) max = Ex10[i+1];
			}
		}
	}
	public static void main(String args[])
	{
		int[] Ex10 = {63,06,21,30,36};
		max_min(Ex10);
		System.out.println("Original Array : " +Arrays.toString(Ex10));
		System.out.println("Maximum value : " +max);
		System.out.println("Minimum value : " +min);
	}
}
