//Linear Search program

class Selection
{
public static void main(String args[])
{
 int a[]={80,60,30,40},temp,i,j;
 System.out.println("Before Batting");
 for(int x: a)
{
 System.out.println(x);
}
 for(i=0;i<a.length-1;i++)
{
 for(j=i+1;j<a.length;j++)
{
 if(a[i]>a[j])
{
 temp=a[i];
 a[i]=a[j];
 a[j]=temp;
}
}
}
System.out.println("After Batting");
 for(int x: a)
{
 System.out.println(x);
}}}