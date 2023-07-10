//fibonacci series with more accuracy
class Testfibo2
{
public static void main(String args[])
{
int a=0,b=1,i=1,n=7,c;


while(i<=n){
c=a+b;
System.out.print(a+" ");
a=b;
b=c;
i++;}
}
}