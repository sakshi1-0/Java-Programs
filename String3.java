//concept of pool and Shared memory

class String3
{
public static void main(String args[])
{
String s1=new String("Hello");
String s2=new String("Hello");
System.out.println("Using Operator");
if(s1==s2)                                             //operator -> physical Address
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}
System.out.println("Using Method");
if(s1.hashCode()==s2.hashCode())                        //method -> Logical Address
{
System.out.println("Same");
}
else
{
System.out.println("Different");
}
}
}