/*# WAP to draw following pattren:-
E
DD
CCC
BBBB
AAAAA
*/

class Pattern13
{
public static void main(String args[])
{
char i,j;
for(i='E';i>='A';i--)
{
for(j='E';j>=i;j--)
{
System.out.print(i);
}
System.out.println();
}
}
}