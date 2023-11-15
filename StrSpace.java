//WAP to find out number of spaces and number of other charactrs in the given string

class StrSpace
{
public static void main(String args[])
{
String str="This is a class of java";
int sp=0 ,ch=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i) == ' ')
{
sp++;
}
else
{
ch++;
}

}
System.out.println("number of spaces="+sp);
System.out.println("number of characters="+ch);
}
}