import java.util.Scanner;
class JavaReplace
{
public static void main(String argts[])
{
Scanner sc=new Scanner(System.in);
String inputstr=sc.nextLine();
String c=sc.next();
String a=sc.next();
String res=inputstr.replaceAll(c,a);
System.out.print(res);
}
}