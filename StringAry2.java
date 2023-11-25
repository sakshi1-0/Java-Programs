//WAP to print all String from given string array that starts with "ind"


class StringAry2
{
public static void main(String args[])
{
String str[]={"indore","bhopal","dewas","ujjain","dhar","india","indonesia","bhind"};
for(String s :str)
{
if(s.indexOf("ind")==0)
System.out.println(s);
}

}
}