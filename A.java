import java.util.Scanner;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int a=sc.nextInt();
for (int i=0;i<=a;i++)
{
for (int j=0;j<=i;j++)
{
System.out.print("#");
}
for (int k=1;k<=a;k--)
{
for(int l=1;l<=k;l++)
{
System.out.print(s);
}
}
System.out.println("");
}
}
}