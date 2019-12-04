class P9
{
public static void main(String args[])
{ String st=args[0];
    int a=Integer.parseInt(args[1]);

if(st.equals("Female"))
{
    if(a>=1 && a<=58)
      System.out.println("Interest = 8.2% ");
if(a>=59 && a<=120)
System.out.println("Interest = 7.6%");
}

else
{
   if(a>=1 && a<=60)
System.out.println("Interest =9.2%");
  if(a>=61 && a<=120)
System.out.println("Interest =8.3%");
}
}
}