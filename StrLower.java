//WAP to print alll characters of given string in lowercase

class StrLower
{
public static void main(String args[])
{
String str="Hello";
char ch;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(ch>='A' && ch<='Z')
{
System.out.print((char)(ch+32));
}
else
{
System.out.print(ch);
}
}
}}