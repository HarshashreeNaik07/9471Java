//Write a Java program that takes two numbers as input and display the product of two numbers.


import java.util.Scanner;
public class Product{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      int a = sc.nextInt();
      System.out.println("Enter the Second number ::");
      int b = sc.nextInt();
      int result = a*b;
      System.out.println("Product of the given two numbers is ::"+result);
   }
}
