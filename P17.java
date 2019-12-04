class P17
{
public static void main(String args[])
{ 
try{
int a=Integer.parseInt(args[0]);

 if(a==1)
{System.out.println("1 is neither prime nor composite");}
 else { int count=0;


for(int i=2;i<a;i++)
{
   if(a%i==0)
count++;
}
if(count==0)
System.out.println(a+" is a prime number");
else
System.out.println(a+" is not a prime number");
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Please enter an integer number");
}
}
}