//behaviour of constructor in inheritance

class A
{
A(int a,int b)
{
System.out.println("Hello from A "+a+" "+b);
}
}

class B extends A
{
B(int a,int b,int c)
{
super(a,b);
System.out.println("Hello from B "+a+" "+b+" "+c);
}
}

class ConstructorInheritance
{
public static void main(String args[])
{
A a1 = new A(10,20);
B b1 = new B(100,200,300);

}
}
