import java.util.Scanner;
class P18
{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int te=a;
int sum=0;
int r,q;

for(;a>0;)
{
r=a%10;
sum=sum+r;
a=a/10;
}
System.out.println(te+"->"+sum);
}
}
