import java.util.Scanner;
class P7
{
  public static void main(String args[])
{
   char a='n';
char b='z';
int c=Character.compare(a,b);
if(c>0)
System.out.println(b+" , "+a);
else 
System.out.println(a+" , "+b);
}
}