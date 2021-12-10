abstract class Shape
{
abstract double calArea();
}
public class Triangle extends Shape
{
int base, height;
public Triangle(int base,int height){
this.base=base;
this.height=height;
}
public double calArea()
{
return 0.5*base*height;
}
public static void main(String args[]){
Shape ref=new Triangle(3,4);
System.out.println(ref.calArea());
}
}
