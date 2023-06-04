import java.util.Scanner;
class Table2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
for (int i=0;i<=m;i=i+n)
{
System.out.print(+i);
if(i<m)
{
System.out.print(",");
}
}
}
}