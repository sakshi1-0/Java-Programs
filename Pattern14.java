/*# WAP to draw following pattren:-
ABCDE
ABCD
ABC
AB
A
*/

class Pattern14
{
public static void main(String args[])
{
char i,j;
for(i='E';i>='A';i--)
{
for(j='A';j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}