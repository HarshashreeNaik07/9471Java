//8. Write a Java program to copy an array by iterating the array.

import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		int[] Ex8 = {01,06,04,98};
		int[] new_Ex8 = new int[10];
		
		System.out.println("Original Array : " +Arrays.toString(Ex8));
		
		for(int i=0; i<Ex8.length; i++)
		{
			new_Ex8[i] = Ex8[i];
		}
		
		System.out.println("New Array: " +Arrays.toString(new_Ex8));
		// TODO Auto-generated method stub

	}

}
