//Write a Java program to print the addition, multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;
class Operations{
    public static void main(String args[]){
        System.out.print("Input first number: ");
        int i = new Scanner(System.in).nextInt();
        System.out.print("Input second number: ");
        int j = new Scanner(System.in).nextInt();
        System.out.println(i+" + "+ j +" = "+ (i+j));
        System.out.println(i+" - "+ j +" = "+ (i-j));
        System.out.println(i+" x "+ j +" = "+ (i*j));
        System.out.println(i+" / "+ j +" = "+ (i/j));
        System.out.println(i+" mod "+ j +" = "+ (i%j));
    }
}
