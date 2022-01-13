
import java.util.*;
import java.io.*;
public class Main1 {

	public static void main(String[] args) {
		
	PriorityQueue<String> pq = new PriorityQueue<>();
	pq.offer("Harshashree");
	pq.offer("Anand");
	pq.offer("Naik");
	for(String x : pq) {
		System.out.print(x + " ");
	}
	System.out.println();
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	
	for(String x : pq) {
		System.out.print(x + " ");
	}

	}

}
