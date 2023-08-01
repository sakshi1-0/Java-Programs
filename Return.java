//Return by value

class Return
{
int add(int a,int b)
{
int c;
c=a+b;
return c;
}
public static void main(String args[])
{
Return r1=new Return();

int s=r1.add(40,50);
System.out.println(s);
System.out.println(r1.add(10,20));
}
}