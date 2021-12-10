interface Greek{}
class Alpha implements Greek{}
class Beta extends Alpha{}
class Delta extends Beta
{
public static void main(String args[])
{
Beta obj = new Beta();
Greek objGrk = (Delta)obj;
}
}
