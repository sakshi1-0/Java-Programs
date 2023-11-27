//Method of String class
//CASES
//hello   HELLO   HELLO    Indore    Hello     HelloIndore     HelloIndore      Hello
//HELLO   hello   Indore   HELLO     HEllo     hello           Hello            HelloIndore

class StrCompareIgnore
{
public static void main(String args[])
{
String s1=new String("indore");
String s2=new String("bhopal");

int x=s1.compareToIgnoreCase(s2);                                            
System.out.println(x);
}
}

