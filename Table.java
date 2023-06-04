import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
String ch=" ";
for (int i=0;i<=15;i++)
{
System.out.println(m+ch+"*"+ch+i+"="+(m*i));
}
}
}