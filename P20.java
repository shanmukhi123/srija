import java.util.Scanner;
class P20
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int te=a;
while(a!=0)
{
int r=a%10;
count++;
if((r==0) && (count==1))
{ a=a/10;}
else
{System.out.print(r);
a=a/10;}
} 
}
}