import java.util.Scanner;
class Print11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int counter=0;
int b=0;
while (counter<=a)
{
b=b+counter;
counter++;
}
System.out.println(b);
}

}
