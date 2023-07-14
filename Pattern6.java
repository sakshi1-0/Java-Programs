/*# WAP to draw following pattren:-
5
44
333
2222
11111
  */

class Pattern6
{
public static void main(String args[])
{
int i,j;
for(i=5;i>=1;i--)
{
for(j=5;j>=i;j--)
{
System.out.print(i);
}
System.out.println();
}
}
}