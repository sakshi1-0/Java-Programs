//WAP to print all String from given string array that contain "ind"


class StringAry3
{
public static void main(String args[])
{
String str[]={"indore","bhopal","dewas","ujjain","dhar","india","indonesia","bhind"};
for(String s :str)
{
if(s.indexOf("in")>=0)
System.out.println(s);
}

}
}