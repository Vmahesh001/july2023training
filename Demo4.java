import java.util.Scanner;
class Demo4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=1;
while (a>0){
b=b*(a%10);
a=a/10;
}
System.out.println(b);
}
}
