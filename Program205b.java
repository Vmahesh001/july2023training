import java.util.*;
public class Program205b
{
public static void main(String args[])
{
char ch;
System.out.println("enter a no:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if(ch>='0'&& ch<='9')
System.out.println(ch+ "is an digit");
else
System.out.println(ch+ "is not an digit");
}
}