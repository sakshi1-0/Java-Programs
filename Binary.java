//Binary Search program

class Binary
{
public static void main(String args[])
{
 int a[]={40,80,60,20,40,10,50,30},temp,i,j;
 int low=0,high=a.length-1,mid,n=490;
 boolean f=false;
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
while(low<=high)
{
 mid=(low+high)/2;
 if(a[mid]==n)
{
 f=true;
 break;
}
 else if(n>a[mid])
{
 low=mid+1;
}
 else
{
 high=mid-1;
}
}
 if(f)
{
System.out.println("Element found");
}
 else
{
System.out.println("Element not found");
}
}}
