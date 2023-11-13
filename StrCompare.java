//Method of String class
//CASES
//hello   HELLO   HELLO    Indore    Hello     HelloIndore     HelloIndore      Hello
//HELLO   hello   Indore   HELLO     HEllo     hello           Hello            HelloIndore

class StrCompare
{
public static void main(String args[])
{
String s1=new String("HelloIndore");
String s2=new String("Hello");

int x=s1.compareTo(s2);                                            
System.out.println(x);
}
}

