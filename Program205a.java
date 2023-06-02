import java.util.*;
public class Program205a
{
public static void main(String args[])
{
char ch;
System.out.println("enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
System.out.println(ch+ "\tis an digit");
else
System.out.println(ch+ "is not an alphabet");
}
}
