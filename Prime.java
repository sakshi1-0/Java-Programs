//WAP to check number is prime or not.
class Prime
{
public static void main(String args[])
{
int n=7;
boolean f=false;
int a=n/2;
for(int i=2;i<=a;i++)
{
if(n%i==0)
{
f=true;
break;
}
}

if(f)
System.out.println("not a prime number");
else
System.out.println("prime number");

}
}