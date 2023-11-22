class StrVowel
{
public static void main(String args[])
{
String s1="This Is Class Of Java";
int v=0,c=0;

for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch>='a' && ch<='z')
{
if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u')
{
v++;
}
else
{
c++;
}
} 
if(ch>='A' && ch<='Z')
{
if(ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch=='U')
{
v++;
}
else
{
c++;
}
}
}

System.out.println("Number of vowels="+v);
System.out.println("Number of consonants="+c);

}
}