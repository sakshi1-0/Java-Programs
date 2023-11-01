class ParameterisedCons
{
int a,b,c;
ParameterisedCons(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
void show()
{
System.out.println(a+" "+b+" "+c);
}
ParameterisedCons()
{

}
public static void main(String args[])
{
ParameterisedCons c1=new ParameterisedCons(3,4,5);
ParameterisedCons c2=new ParameterisedCons(10,40,60);
c1.show();
c2.show();
ParameterisedCons c3=new ParameterisedCons();
c3.show();
}

}