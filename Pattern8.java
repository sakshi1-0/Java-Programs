/*# WAP to draw following pattren:-
11111
2222
333
44
5  */

class Pattern8
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=5;j>=i;j--)
{
System.out.print(i);
}
System.out.println();
}
}
}