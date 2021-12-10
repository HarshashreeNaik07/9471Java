class Demo
{}
public class SubDemo extends Demo
{
public static void main(String args[]){
Demo obj=new SubDemo();
System.out.println(obj instanceof Demo);
}
}
