import java.util.regex.*;   
public class String2 {
	public static void main(String[] args) {
		String input="HelloWelcome";
		String pattern="\\sHello\\sWelcome\\s";
		boolean flag = Pattern.matches(pattern,input);
		System.out.println(flag);
	}
}
