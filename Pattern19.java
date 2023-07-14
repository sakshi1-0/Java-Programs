/*# WAP to draw following pattren:-
        *
       **
      *** 
     ****
    *****
*/



class Pattern19
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=5;i++)
{
for(k=5;k>i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print('*');
}
System.out.println();
}
}
}

/*
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=5;j>=i;j--)
{
if(j>1)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
System.out.println();
}
}
}}*/