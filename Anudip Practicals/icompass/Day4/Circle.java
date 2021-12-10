abstract class Shape
{
	abstract double calArea();
	
}
public class Circle extends Shape
{
	int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public double calArea()
	{
		return 3.142*radius*radius;
	}
	public static void main(String args[])
	{
		Shape obj=new Circle(5);
		System.out.println(obj.calArea());
	}
}
