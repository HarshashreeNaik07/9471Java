import java.util.Scanner;

public class PositiveorNegative1{
public static void main(String args[]){ 
int a;
Scanner myObj = new Scanner(System.in);
System.out.println("Enter Number: ");
a = myObj.nextInt();

if(a>=0){
System.out.println("Number is Positive");
}
else if(a<0){
 System.out.println("Number is Negative");
}
else{
System.out.println("Number is zero");
}
}
}
