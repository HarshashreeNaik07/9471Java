//Ex12

import java.util.Scanner;
class Average{

public static void main(String args[]){
Scanner in = new Scanner(System.in);

System.out.println("Enter First Number: ");
int num1 = in.nextInt();

System.out.println("Enter Second Number: ");
int num2 = in.nextInt();

System.out.println("Enter Third Number: ");
int num3 = in.nextInt();

System.out.println("Average is: " +(num1 + num2 + num3) / 3);
}
}
