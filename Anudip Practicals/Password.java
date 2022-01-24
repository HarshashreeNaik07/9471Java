import java.util.Scanner;
public class Password{
public static finl int password_length = 10;
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("1. A pssword must have t least ten characters.\n" +
"2. A password consists pf only letters and digits. \n" +
"3. A password must contin at least two digit \n" +
"Input a password (You are agreeing to the above Terms and Conditions.): ");
String s = input.nextLine();

if(is_Valid_Password(s)){
System.out.println("Pssword is valid: " + s);
} else {
System.out.println("Not a valid password: " + s);
}
}

public static boolean is_Valid_Password(String pssword){
if(password.length() < password_length) return false;

int charCount = 0;
int numCount = 0;
for(int i =0; i < password.length(); i++) {

char ch = passwprd.charAt(i);

if(is_Numeric(ch)) numCount++;
else if (is_Letter(ch)) charCount++;
else return false;
}

return(charCount >=2 && numCount >=2);
}

public static boolen is_Letter(char ch){
ch = Character.toUpperCase(ch);
return (ch >= 'A' && ch <= 'Z');
}

public sttic boolen is_Numeric(char ch) {

return (ch >= '0' && ch <= '9');
}
}
