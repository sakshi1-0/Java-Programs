/*# WAP to draw following pattren:-
EDCBA
EDCB
EDC
ED
E
*/

class Pattern16
{
public static void main(String args[])
{
char i,j;
for(i='A';i<='E';i++)
{
for(j='E';j>=i;j--)
{
System.out.print(j);
}
System.out.println();
}
}
}