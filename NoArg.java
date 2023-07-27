//No Argument Method

class NoArg
{
int a,b,c;
void show()
{
System.out.println(a+" "+b+" "+c);

}
public static void main(String args[])
{
NoArg n1=new NoArg();
NoArg n2=new NoArg();
n1.a=10;
n1.b=20;
n1.c=30;
n2.a=100;
n2.b=200;
n2.c=300;
n1.show();
n2.show();
}
}