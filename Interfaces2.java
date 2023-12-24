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
class A implements First,Second
{
public void show()
{
System.out.println("Hello from show");
}
public void display()
{
System.out.println("Hello from display");
}
void data()
{
System.out.println(First.a);
System.out.println(Second.a);
}
}

class Interfaces2
{
public static void main(String args[])
{
A a1 = new A();
a1.show();
a1.display();
a1.data();
}
}