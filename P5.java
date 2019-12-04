import java.util.Scanner;
class P5
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
if(a%2 == 0)
System.out.println("The num is even");
else
System.out.println("The num is odd");
}
}