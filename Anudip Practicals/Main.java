import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> ar = new Stack<>();
		ar.push(1);
		ar.push(2);
		
		for(Integer x: ar) {
			System.out.print(x + "  ");
		}
		System.out.println("*********************");
		ar.peek();
		System.out.println(ar);
		System.out.println("*********************");
        ar.remove(0);
        System.out.println(ar);
	}

}
