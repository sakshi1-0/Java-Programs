class VarArgs
{
void add (int ...a)
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
VarArgs a=new VarArgs();

a.add(10,25,36,8,90);
a.add(1,2,3,4,5,6,7,8,9);
}
}