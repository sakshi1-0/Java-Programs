//class object instance variable

class ClsObj
{
int a=10;
public static void main(String args[])
{
ClsObj c1=new ClsObj();
ClsObj c2=new ClsObj();
System.out.println(c1.a);
System.out.println(c2.a);
c1.a++;
c2.a--;
System.out.println(c1.a);
System.out.println(c2.a);


}
}