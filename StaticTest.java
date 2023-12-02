//Static variable,method,block

class StaticTest
{
 static int a=70;
 static void show()
{
 System.out.println(a+5); 
}

static
{
a=a*2;
System.out.println(a);
}

public static void main(String args[])
{
  System.out.println("Hello");  
  StaticTest.show(); 
  System.out.println(a);
  System.out.println(StaticTest.a);

}
} 