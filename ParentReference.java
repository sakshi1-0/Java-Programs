//refrence of parent class can hold the object of child class 
class A
{
void show()
{
System.out.println("Hello from A ");
}
}

class B extends A
{
void display()
{

System.out.println("Hello from B ");
}
}

class ParentReference
{
public static void main(String args[])
{
A a1;
B b1 = new B();
a1=b1;
a1.show();
b1.show();
b1.display();

}
}
