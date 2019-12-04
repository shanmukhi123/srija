class P16
{
public static void main(String args[])
{
   

for(int j=10;j<=99;j++)
{ int count=0;
for(int i=2;i<j;i++)
{
   if(j%i==0)
count++;
}

if(count==0)
System.out.println(j+" is a prime number");
}
}
}