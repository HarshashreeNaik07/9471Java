import java.util.*;
public class TryCatchDZero{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Two Numbers:  ");
int n = sc.nextInt();
int m = sc.nextInt();

try{
System.out.println(n / m);
}

catch(Exception e){
System.out.println("Divide by Zero not possible");
}
}
}
