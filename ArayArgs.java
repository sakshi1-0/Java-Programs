class ArayArgs
{
void add (int a[])
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println(sum);

}
public static void main(String args[])
{
ArayArgs a=new ArayArgs();
int x[]={10,20,30,40,50};
int y[]={1,2,3,4,5,6,7,8,9};
a.add(x);
a.add(y);
}
}