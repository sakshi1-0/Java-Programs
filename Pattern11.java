/*# WAP to draw following pattren:-
A
AB
ABC
ABCD
ABCDE
*/

class Pattern11
{
public static void main(String args[])
{
char i,j;
for(i='A';i<='E';i++)                                   //or can use ascii codes in place of characters
{
for(j='A';j<=i;j++)                      
{
System.out.print(j);
}
System.out.println();
}
}
}