import java.util.Scanner;
class P15
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("enter the number");
int a=sc.nextInt();
for(int i=2;i<a;i++)
{
   if(a%i==0)
count++;
}
if(count==0)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");
}
}