//Encapsulation

class Encapsulation{
private int Aadhar;
private String empName;
private int empAge;
public int getEmpAadhar(){
return aadhar;}
}
public String getEmpName(){
return empName;
}
public int getEmpAge(){
return empAge;
}
public void setEmpAge(int newValue){
empAge = newValue;
}
public void setEmpName(String newValue){
empName = newValue;
}
public void setEmpAadhar(int newVlaue){
aadhar = newValue;
}
}
public class EncapsTest{
public static void main(String args[]){
Encapsulation obj = new Encapsulation();
obj.setEmpName("Ram");
obj.setEmpAge(28);
obj.setEmpAadhar(1111,2222,3333);
System.out.println("Employee Name: " +obj.getEmpName());
System.out.println("Employee Aadhar: " +obj.getEmpAadhar());
System.out.println("Employee Age: " +obj.getEmpAge());
}}
