//Static variable

class StaticVar
{
 static int a;
public static void main(String args[])
{
 StaticVar t1=new StaticVar();
 StaticVar t2=new StaticVar();
 StaticVar t3=new StaticVar();
 t1.a=10;
 t2.a=100;
 t3.a=1000;
 System.out.println(t1.a);
 System.out.println(t2.a);
 System.out.println(t3.a);
 System.out.println(a);
 System.out.println(StaticVar.a);

}
} 