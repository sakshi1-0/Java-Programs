//Single level inheritance

class A
{ 
 void show()
{
 System.out.println("In class A");
}

}

class B extends A
{
 void display()
{
 System.out.println("In class B");
}
 
}

class SingleInherit
{
public static void main(String args[])
{ 
 A a1=new A();
 B b1=new B();
 
 a1.show();
 b1.show();
 b1.display();
 
}
}