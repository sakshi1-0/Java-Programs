class LogicalAnd{
public static void main(String args[])
{
int a=10,b=10,c=10;
boolean x;
x=++a==b++ && --b==++c;            //short circuit
System.out.println(x);
System.out.println(a+" "+b+" "+c);

}
}