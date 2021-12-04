//Encapsulation

class Encaps
{
private int i;
public int geti()
{
return i;
}

public void seti(int xyz){
i = xyz;
}
}

class EncapsDemo1
{
public static void main(String args[])
{
Encaps obj = new Encaps();
obj.seti(456);
System.out.println("i value: " +obj.geti());
}
}
