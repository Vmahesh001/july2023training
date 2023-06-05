import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int j=0;
for (int i=1;i<=a;i++)
{
j=j+i;
}
System.out.println("sum="+j);
}
}