import java.util.*;
public class ColorSortArray {

	public static void main(String[] args) {
		
		List<String>  list_Strings = new ArrayList<String>();
		list_Strings.add("Purple");
		list_Strings.add("Maroon");
		list_Strings.add("Black");
		list_Strings.add("Pink");
		list_Strings.add("Brown");
		System.out.println("List before sort:  " + list_Strings);
		Collections.sort(list_Strings);
		System.out.println("List after sort: " + list_Strings);
	}

}
