class Animal{
void eat(){
System.out.println("Eating");}
}

class Dog extends Animal{
void bark(){
System.out.println("Barking");}
}

class Puppy extends Dog{
void weep(){
System.out.println("weeping");}
}

class MInheritance{
public static void main(String args[]){
Puppy p = new Puppy();
p.bark();
p.weep();
p.eat();
}
}
