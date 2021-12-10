import java.util.*;
public class Main7 {
	public static void main(String args[])
	{
		Set set = new TreeSet();
		set.add("anu");
		set.add("anil");
		set.add("sunil");
		for(Object str:set) {
			System.out.print(str + " ");
		}
	}

}
