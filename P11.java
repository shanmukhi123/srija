import java.util.Scanner;
class P11
{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
String s=sc.next();
switch(s)
{
   case "R": System.out.println(s+"->Red");
   break;
case "B": System.out.println(s+"->Blue");
   break;
case "G": System.out.println(s+"->Green");
   break;
case "O": System.out.println(s+"->Orange");
   break;
case "Y": System.out.println(s+"->Yellow");
   break;
case "W": System.out.println(s+"->White");
   break;
default:System.out.println("Invalid Code");
}
}
}