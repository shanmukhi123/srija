import java.util.Scanner;
class P4
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
if(a==0)
{
System.out.println("The num is Zero");
}
else if(a>0)
{
  System.out.println("The num is Positive");
}
else
{
System.out.println("The num is Negative");
}
}
}