//this Keyword

class This
{
int a,b,c;
void show()
{
System.out.println(a+" "+b+" "+c);

}
void setData(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
public static void main(String args[])
{
This p1=new This();
This p2=new This();
p1.setData(10,20,30);
p2.setData(100,200,300);
p1.show();
p2.show();
}
}