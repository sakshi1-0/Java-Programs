//Parameterised Method

class Parameter
{
int a,b,c;
void show()
{
System.out.println(a+" "+b+" "+c);

}
void setData(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
public static void main(String args[])
{
Parameter p1=new Parameter();
Parameter p2=new Parameter();
p1.setData(10,20,30);
p2.setData(100,200,300);
p1.show();
p2.show();
}
}