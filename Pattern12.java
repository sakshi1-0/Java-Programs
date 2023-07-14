/*# WAP to draw following pattren:-
E
ED
EDC
EDCB
EDCBA
*/

class Pattern12
{
public static void main(String args[])
{
char i,j;
for(i='E';i>='A';i--)
{
for(j='E';j>=i;j--)
{
System.out.print(j);
}
System.out.println();
}
}
}