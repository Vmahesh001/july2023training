import java.util.Scanner;
class Demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
long a=sc.nextLong();
long j=1;
for (long i=1;i<=a;i++)
{
j=j*i;
}
System.out.println(a+" factorial is "+j);
}
}