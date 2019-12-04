import java.util.Scanner;
class P10
{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
    char s=sc.next().charAt(0);
if(s>=65 && s<=90)
  {
char l=Character.toLowerCase(s) ;
System.out.println(s+"->"+l);
}
else{
char g=Character.toUpperCase(s);
System.out.println(s+"->"+g);
}
}
}