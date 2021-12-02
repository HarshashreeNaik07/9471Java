//Take three numbers from the user and print the greatest number. 
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87 

import java.util.Scanner; 
    public class LargestNumber{  
    public static void main(String[] args){  
    int a, b, c, largest, temp;  
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the first number:");  
    a = sc.nextInt();  
    System.out.println("Enter the second number:");  
    b = sc.nextInt();  
    System.out.println("Enter the third number:");  
    c = sc.nextInt();  
    if(a>b && a>c){
    System.out.println("Greater number is: " +a);
    }
    else if(b>a && b>c){
    System.out.println("Greater number is: " +b);
    }
    else if(c>a && c>b){
    System.out.println("Greater number is: " +c);
    } 
    else{
    System.out.println("Numbers are Equal");
    }
    }  
    }  
