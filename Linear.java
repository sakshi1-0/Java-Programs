//Linear Search program

class Linear
{
public static void main(String args[])
{
int a[]={50,60,40,70,20,10,100,30,80,90},n=200;
boolean f=false;
for(int i=0;i<a.length;i++)
{
 if(a[i]==n)
{
 f=true;
 break;
}
}
if(f)
{
 System.out.println("Number Found");
}
else
{
 System.out.println("Number not Found");
}
}
}