import java.util.*;
public class Operation{

	public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = in.nextInt();

System.out.println("Enter second number: ");
int num2 = in.nextInt();

System.out.println("Enter third number: ");
int num3 = in.nextInt();

System.out.println("Addition: " +(num1+num2+num3));
System.out.println("Subtraction: " +(num1-num2-num3));
System.out.println("Multiplication: " +(num1*num2*num3));
System.out.println("Division: " +(num1/num2/num3));

if(num1>num2 && num1>num3){
    System.out.println("Greater number is: " +num1);
    }

    else if(num2>num1 && num2>num3){
    System.out.println("Greater number is: " +num2);
    }

    else if(num3>num1 && num3>num2){
    System.out.println("Greater number is: " +num3);
    } 

    else{
    System.out.println("Numbers are Equal");
    } 
}
}
