class P8
{
  public static void main(String args[])
{
  char a='*';
if((a>=97 && a<=122) || (a>= 65 && a<=90))
System.out.println("Alphabet");
else if(a>=48 && a<=57)
System.out.println("Digit");
else
System.out.println("Special Character");
}
}