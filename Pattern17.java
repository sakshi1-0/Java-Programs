/*# WAP to draw following pattren:-
EEEEE
DDDD
CCC
BB
A
*/

class Pattern17
{
public static void main(String args[])
{
char i,j;
for(i='E';i>='A';i--)
{
for(j='A';j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}