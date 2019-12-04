class P21
{
  public static void main(String args[])
{
  StringBuffer s=new StringBuffer(args[0]);
  s.reverse();
String g=s.toString();
if (args[0].equals(g))
System.out.println(args[0]+" is a palindrome");
else
System.out.println(args[0]+" is  not a palindrome");
}
}