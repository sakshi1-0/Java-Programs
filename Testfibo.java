class Testfibo
{
public static void main(String args[])
{
int a=0,b=1,i=1,n=0,c;

System.out.print(a+" "+b+" ");
while(i<=(n-2)){
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
i++;}
}
}