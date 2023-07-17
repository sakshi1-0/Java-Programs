//Hasjcode & Reference

class Hash
{

public static void main(String args[])
{
Hash h1=new Hash();
Hash h2=new Hash();
Hash h3=h2;                                        //Reference
System.out.println(h1);
System.out.println(h2);        // generate Hashcode
System.out.println(h1.toString());
System.out.println(h1.hashCode());
System.out.println(h3);



}
}