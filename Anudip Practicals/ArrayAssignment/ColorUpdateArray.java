import java.util.*;
public class ColorUpdateArray {

	public static void main(String[] args) {
		
		List<String>  list_Strings = new ArrayList<String>();
		list_Strings.add("Purple");
		list_Strings.add("Maroon");
		list_Strings.add("Black");
		list_Strings.add("Pink");
		list_Strings.add("Brown");
		System.out.println(list_Strings);

		list_Strings.set(2,"Yellow");

		System.out.println(list_Strings);

	}

}
