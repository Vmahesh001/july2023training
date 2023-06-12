import java.util.*;
class Fabonaci
{
public static void main(String args[])
{ 
int a=0,b=1,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value:");
n=sc.nextInt();
System.out.println("fabanoci series:");
while(sum<=n)
{
System.out.print(sum);
a=b;
b=sum;
sum=a+b;
if(sum<n)
{
System.out.print(",");
}
}
}
}

