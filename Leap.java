class Leap{
public static void main(String args[])
{
int a=2027;
if(a%100==0){
System.out.println("Not a leap year");
}
else if (a%400==0)
{System.out.println("leap year");
}
else if(a%4==0)
{System.out.println("leap year");
}
else
{System.out.println("Not a leap year");
}
}
}