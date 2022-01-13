import java.util.*;
public class CopyArrayList {
public static void main(String[] args) {
List<String> ListI = new ArrayList<String>();
ListI.add("06");
ListI.add("21");
ListI.add("36");
System.out.println("ListI:  " + ListI);

List<String> ListII = new ArrayList<String>();
ListII.add("Usha");
ListII.add("Jayshree");
ListII.add("Harshashree");
System.out.println("ListII:  " + ListII);

Collections.copy(ListI, ListII);
System.out.println("Copy ListI to ListII, \nAfter copy: ");
System.out.println("ListI: " + ListI);
System.out.println("ListII: " + ListII);
}
}
