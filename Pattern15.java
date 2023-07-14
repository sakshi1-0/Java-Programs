/*# WAP to draw following pattren:-
AAAAA
BBBB
CCC
DD
E
*/

class Pattern15
{
public static void main(String args[])
{
char i,j;
for(i='A';i<='E';i++)
{
for(j='E';j>=i;j--)
{
System.out.print(i);
}
System.out.println();
}
}
}