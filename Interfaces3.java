// INTERFACES

interface First
{
int a=10;
void show();
}

interface Second
{
int a=20;
void display();
}
class A 
{
void add()
{
System.out.println("Hello from A");
}
}

class B extends A implements First,Second
{
public void show()
{
System.out.println("Hello from show");
}
public void display()
{
System.out.println("Hello from display");
}
}

class Interfaces3
{
public static void main(String args[])
{
B b1 = new B();
b1.show();
b1.display();
b1.add();
}
}