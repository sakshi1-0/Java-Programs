/*# WAP to draw following pattren:-
1
12
123
1234
12345 
  */

class Pattern3
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}}