//Method Overloading

class MethodOverload
{
void add()
{
System.out.println("Hello");
}

void add(int p,int c)
{
System.out.println(p+c);
}

void add(int x,int y,int z)
{
System.out.println(x+y+z);
}

void add(int a,int b,int c, int d)
{
System.out.println(a+b+c+d);
}

void add(int x,int y,double z)
{
System.out.println(x+y+z);
}

public static void main(String args[])
{
MethodOverload m1=new MethodOverload();

m1.add();
m1.add(10,20);
m1.add(10,20,30,40);
m1.add(1,2,3);
m1.add(3,4,5.5);
}
}