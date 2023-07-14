/*# WAP to draw following pattren:-
1
23
456
78910
*/

class Pattern18
{
public static void main(String args[])
{
int i,j,k=1;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(k+" ");
k++;
}
System.out.println();
}
}
}